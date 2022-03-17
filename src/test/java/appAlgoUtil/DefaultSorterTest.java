package appAlgoUtil;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DefaultSorterTest {

    private final Sorter sorter = new DefaultSorter();

    @Test
    void returnNullIfInputParametersAreNull() {
        assertNull(sorter.sort(null));
    }

    @Test
    void returnCorrectResultIfInputParametersAreCorrect() {
        assertEquals(Arrays.asList("aaa,aaa", "aaa,aaab", "aab,aaa", "aab,aab"),
                sorter.sort(Arrays.asList("aaa,aaab", "aab,aab", "aab,aaa", "aaa,aaa")));
    }
}
