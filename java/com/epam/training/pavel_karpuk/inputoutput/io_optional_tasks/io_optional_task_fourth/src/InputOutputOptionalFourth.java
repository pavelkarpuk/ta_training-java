import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class InputOutputOptionalFourth {
    private static String pathForNewDirectory = "./inputoutput/io_optional_tasks/io_optional_task_fourth/data";
    private static String nameOfNewJavaProgram = "fourthOptionalTask.java";
    private static String pathJavaProgram = "./inputoutput/io_optional_tasks/io_optional_task_fourth/src/InputOutputOptionalFourth.java";

    public static void main(String[] args) throws IOException {
        File directory = new File(pathForNewDirectory);
        File file = new File(directory, nameOfNewJavaProgram);
        directory.mkdir();
        file.createNewFile();

        List<String> textOfJavaProgram = readFile(pathJavaProgram);
        writeListToFile(getListWithUppercaseCharacter(textOfJavaProgram), file);
    }

    private static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    private static List<String> getListWithUppercaseCharacter(List<String> list) {
        for (String line : list) {
            list.set(list.indexOf(line), refactoringOfString(refactorToUppercaseIfStringLongerTwoCharacters(line)));
        }
        return list;
    }

    private static String refactorToUppercaseIfStringLongerTwoCharacters(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) words[i] = words[i].toUpperCase();
        }
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
