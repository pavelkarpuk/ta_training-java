import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ActionsWithList {

    public List<String> readsLinesFromFileToList() throws IOException {
        return Files.readAllLines(Paths.get("./collections/optional_task/first_task/Song.txt"));
    }

    public void getListInReverseOrder(List<String> lines) {
        Collections.reverse(lines);
    }

    public void writesLinesFromListToFile(List<String> lines) throws IOException {
        Files.write(Path.of("./collections/optional_task/first_task/Song.txt"), lines);
    }
}
