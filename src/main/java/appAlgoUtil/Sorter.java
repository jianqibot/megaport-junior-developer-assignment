package appAlgoUtil;

import java.util.List;

public interface Sorter {
    /**
     * Sort names by last name order followed by first name order
     * @param names input unsorted names
     * @return output sorted names
     */
    List<String> sort(List<String> names);
}
