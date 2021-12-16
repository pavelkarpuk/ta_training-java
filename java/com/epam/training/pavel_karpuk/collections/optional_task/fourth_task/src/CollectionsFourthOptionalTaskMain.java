import java.io.IOException;
import java.util.List;

public class CollectionsFourthOptionalTaskMain {
    public static void main(String[] args) throws IOException {
        ActionsWithList actionsWithList = new ActionsWithList();
        List<String> lines = actionsWithList.readsLinesFromFileToList();
        lines.forEach(System.out::println);

        System.out.println();

        actionsWithList.sortByLinesLength(lines);
        lines.forEach(System.out::println);
    }
}