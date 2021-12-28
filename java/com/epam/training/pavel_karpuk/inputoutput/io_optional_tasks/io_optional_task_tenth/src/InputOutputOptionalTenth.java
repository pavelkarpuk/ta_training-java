import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class InputOutputOptionalTenth {
    private static final String PATH_FILE = "./inputoutput/io_optional_tasks/io_optional_task_tenth/data/text.txt";

    public static void main(String[] args) {
        File file = new File(PATH_FILE);

        List<String> text = readFile();
        writeListToFile(getListWithSwapFirstAndLastWordInEachRow(text), file);
    }

    private static List<String> readFile() {
        try {
            return Files.readAllLines(Path.of(InputOutputOptionalTenth.PATH_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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

    private static void writeListToFile(List<String> list, File file) {
        try {
            Files.write(Path.of(file.getPath()), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
