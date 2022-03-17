package appFileUtil;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

public class DefaultTextAppFileReader implements AppFileReader {

    @Override
    public List<String> readNamesFromFile(String fileNameToRead) {

        List<String> result = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameToRead), StandardCharsets.UTF_8))){
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
            br.close();
            return result;

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + fileNameToRead + " does not exist!");

        } catch (IOException ioException) {
            System.out.println("Error in reading lines from file " + fileNameToRead + "!");
        }

        return null;
    }
}
