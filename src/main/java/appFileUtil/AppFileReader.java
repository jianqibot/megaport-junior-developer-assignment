package appFileUtil;

import java.util.List;

public interface AppFileReader {
    /**
     * Read names from an arbitrary file on disk
     * @param fileName Either relative path or absolute path
     * @return List of reading values
     */
    List<String> readNamesFromFile(String fileName);
}
