
import appAlgoUtil.Sorter;
import appAlgoUtil.DefaultSorter;
import appFileUtil.AppFileReader;
import appFileUtil.AppFileWriter;
import appFileUtil.DefaultTextAppFileReader;
import appFileUtil.DefaultTextAppFileWriter;

import java.util.List;


public class ConsoleApp {

    private final AppFileReader fileReader;
    private final Sorter sorter;
    private final AppFileWriter fileWriter;

    public ConsoleApp(AppFileReader fileReader, Sorter sorter, AppFileWriter fileWriter) {
        this.fileReader = fileReader;
        this.sorter = sorter;
        this.fileWriter = fileWriter;
    }


    public static void main(String[] args) {
        ConsoleApp app = new ConsoleApp(new DefaultTextAppFileReader(), new DefaultSorter(), new DefaultTextAppFileWriter());
        System.out.println("sort-names " + args[0]);
        List<String> names = app.fileReader.readNamesFromFile(args[0]);
        List<String> sortedNames = app.sorter.sort(names);
        if (sortedNames != null) {
            sortedNames.forEach(System.out::println);
        }
        String newFileName = args[0].replace(".txt", "-sorted.txt");
        int status = app.fileWriter.writeNamesIntoFile(newFileName, sortedNames);
        if (status == 0) {
            System.out.println("Finished: created " + newFileName);
        }
    }
}
