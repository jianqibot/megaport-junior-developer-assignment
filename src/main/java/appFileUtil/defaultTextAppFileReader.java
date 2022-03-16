package appFileUtil;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class defaultTextAppFileReader implements AppFileReader {

    @Override
    public List<String> readNamesFromFIle(String fileNameToRead) {

        List<String> result = new LinkedList<>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameToRead)));
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
            br.close();
            return result;

        } catch (FileNotFoundException e) {
            System.out.println("Error in opening file " + fileNameToRead + "!");
        } catch (IOException ioException) {
            System.out.println("Error in reading lines from file " + fileNameToRead + "!");
        }

        return null;
    }
}