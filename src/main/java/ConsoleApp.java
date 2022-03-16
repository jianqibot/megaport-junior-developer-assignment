
import appAlgoUtil.Sorter;
import appAlgoUtil.defaultSorter;
import appFileUtil.AppFileReader;
import appFileUtil.AppFileWriter;
import appFileUtil.defaultTextAppFileReader;
import appFileUtil.defaultTextAppFileWriter;

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
        ConsoleApp app = new ConsoleApp(new defaultTextAppFileReader(), new defaultSorter(), new defaultTextAppFileWriter());
        System.out.println(args[0]);
        List<String> names = app.fileReader.readNamesFromFIle(args[0]);
        List<String> sortedNames = app.sorter.sort(names);
        app.fileWriter.writeNamesIntoFile(args[0].replace(".txt", "-sorted.txt"), sortedNames);
    }
}
