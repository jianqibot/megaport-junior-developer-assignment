package appFileUtil;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefaultTextAppFileWriterTest {

    private final AppFileWriter writer = new DefaultTextAppFileWriter();

    @Test
    void returnErrorCodeWhenInputNamesIsNull() {
        assertEquals(-1, writer.writeNamesIntoFile("abc.txt", null));
    }

    @Test
    void returnErrorCodeIfIOExceptionOccurs() throws IOException {

        File directory = new File("testDirectory");
        directory.mkdir();
        assertEquals(-2, writer.writeNamesIntoFile(directory.getAbsolutePath(), Arrays.asList("aaa", "bbb", "ccc")));
        directory.delete();
    }

    @Test
    void writingToFileOkayIfInputParametersAreCorrect() throws IOException {

        File file = new File("testFile.txt");
        file.createNewFile();
        assertEquals(0, writer.writeNamesIntoFile(file.getAbsolutePath(), Arrays.asList("aaa", "bbb", "ccc")));
        List<String> content = Files.readAllLines(Paths.get("testFile.txt"), StandardCharsets.UTF_8);
        assertEquals(content, Arrays.asList("aaa", "bbb", "ccc"));
        file.delete();
    }
}
