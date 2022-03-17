package appFileUtil;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DefaultTextAppFileReaderTest {

    private final AppFileReader reader = new DefaultTextAppFileReader();

    @Test
    void returnNullIfFileNotFound() {
        assertNull(reader.readNamesFromFile("testFile.txt"));
    }

    @Disabled("Hard to mock IO exception for BufferedReader")
    @Test
    void returnNullIfIOExceptionOccurs() throws IOException {
    }

    @Test
    void readingFromFileOkayIfInputParametersAreCorrect() throws IOException {

        Path output = Paths.get("testFile.txt");
        List<String> arrayList = new ArrayList<>(Arrays.asList("aaa", "bbb", "cccc"));
        Files.write(output, arrayList, StandardCharsets.UTF_8);
        assertEquals(reader.readNamesFromFile("testFile.txt"), arrayList);
        Files.delete(output);
    }
}
