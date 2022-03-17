package appFileUtil;

import java.util.List;

public interface AppFileWriter {
    /**
     * Write list of names into an arbitrary file on disk
     * @param fileName Either relative path or absolute path
     * @param Names List of writing values
     * @return Status code, 0 means okay, negative number means error occurs
     */
    int writeNamesIntoFile(String fileName, List<String> Names);
}
