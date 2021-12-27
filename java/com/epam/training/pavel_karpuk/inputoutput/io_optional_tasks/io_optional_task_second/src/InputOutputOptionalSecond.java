import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class InputOutputOptionalSecond {
    private static final String pathForNewDirectory = "./inputoutput/io_optional_tasks/io_optional_task_second/data";
    private static final String nameOfNewJavaProgram = "secondOptionalTask.java";
    private static final String pathJavaProgram = "./inputoutput/io_optional_tasks/io_optional_task_second/src/InputOutputOptionalSecond.java";
    private static final String replacedWord = "public";
    private static final String replacementWord = "private";

    public static void main(String[] args) throws IOException {
        File directory = new File(pathForNewDirectory);
        File file = new File(directory, nameOfNewJavaProgram);
        directory.mkdir();
        file.createNewFile();

        List<String> textOfJavaProgram = readFile();
        writeListToFile(getListWithModifyAccessLevels(textOfJavaProgram), file);
    }

    private static List<String> readFile() throws IOException {
        return Files.readAllLines(Path.of(InputOutputOptionalSecond.pathJavaProgram));
    }

    private static List<String> getListWithModifyAccessLevels(List<String> list) {
        for (String line : list) {
            if (line.contains(replacedWord))
                list.set(list.indexOf(line), refactoringOfString(replaceWordInString(line)));
        }
        return list;
    }

    private static String replaceWordInString(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(replacedWord)) words[i] = replacementWord;
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
