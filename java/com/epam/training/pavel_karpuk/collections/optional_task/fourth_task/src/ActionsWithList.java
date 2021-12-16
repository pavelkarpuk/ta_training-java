import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

public class ActionsWithList {

    public List<String> readsLinesFromFileToList() throws IOException {
        return Files.readAllLines(Paths.get("./collections/optional_task/fourth_task/Poem.txt"));
    }

    public void sortByLinesLength (List<String> lines) {
        lines.sort(Comparator.comparingInt(String::length));
    }
}