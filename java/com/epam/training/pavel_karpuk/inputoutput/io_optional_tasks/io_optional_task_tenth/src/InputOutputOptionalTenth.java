import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class InputOutputOptionalTenth {
    private static String pathFile = "./inputoutput/io_optional_tasks/io_optional_task_tenth/data/text.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(pathFile);

        List<String> text = readFile(pathFile);
        writeListToFile(getListWithSwapFirstAndLastWordInEachRow(text), file);
    }

    private static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    private static List<String> getListWithSwapFirstAndLastWordInEachRow(List<String> list) {
        for (String line : list) {
            list.set(list.indexOf(line), refactoringOfString(swapFirstAndLastWordInRow(line)));
        }
        return list;
    }

    private static String swapFirstAndLastWordInRow(String line) {
        String[] words = line.split(" ");
        String lastWord = words[words.length - 1];
        words[words.length - 1] = words[0];
        words[0] = lastWord;
        return Arrays.toString(words);
    }

    private static String refactoringOfString(String line) {
        line = line.replace(",", "")
                .replace("[", "")
                .replace("]", "");
        return line;
    }

    private static void writeListToFile(List<String> list, File file) throws IOException {
        Files.write(Path.of(file.getPath()), list);
    }
}
