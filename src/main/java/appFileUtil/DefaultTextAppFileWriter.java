package appFileUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DefaultTextAppFileWriter implements AppFileWriter {

    @Override
    public int writeNamesIntoFile(String outputFileName, List<String> names) {

        if (names == null) {
            return -1;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, StandardCharsets.UTF_8))){

            for (String name : names) {
                writer.write(name + "\n");
            }
            writer.close();
            return 0;

        } catch (IOException e) {
            System.out.println("Error in opening file " + outputFileName + " for write!");
            return -2;
        }
    }
}
