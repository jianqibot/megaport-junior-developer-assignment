package appAlgoUtil;

import entity.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultSorter implements Sorter{
    @Override
    public List<String> sort(List<String> names) {

        if (names == null) {
          return null;
        }

        return names.stream()
                .map(Person::formPerson)
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Comparator.comparing(Person::getLastName)))
                .map(Person::formName)
                .collect(Collectors.toList());
    }
}
