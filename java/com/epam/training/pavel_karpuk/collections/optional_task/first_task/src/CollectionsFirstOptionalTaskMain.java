import java.io.IOException;
import java.util.List;

public class CollectionsFirstOptionalTaskMain {
    public static void main(String[] args) throws IOException {
        ActionsWithList actionsWithList = new ActionsWithList();
        List <String> lines = actionsWithList.readsLinesFromFileToList();
        lines.forEach(System.out::println);

        System.out.println();

        actionsWithList.getListInReverseOrder(lines);
        lines.forEach(System.out::println);

        actionsWithList.writesLinesFromListToFile(lines);
    }
}
