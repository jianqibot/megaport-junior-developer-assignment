package appFileUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class defaultTextAppFileWriter implements AppFileWriter{

    @Override
    public void writeNamesIntoFile(String outputFileName, List<String> names) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(outputFileName));
            for (String name : names) {
                writer.print(name + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error in opening file " + outputFileName + " for write!");
        }
    }
}
