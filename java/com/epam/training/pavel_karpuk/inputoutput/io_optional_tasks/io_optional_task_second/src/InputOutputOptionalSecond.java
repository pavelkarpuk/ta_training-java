import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class InputOutputOptionalSecond {
    private static final String PATH_FOR_NEW_DIRECTORY = "./inputoutput/io_optional_tasks/io_optional_task_second/data";
    private static final String NAME_OF_NEW_JAVA_PROGRAM = "secondOptionalTask.java";
    private static final String PATH_JAVA_PROGRAM = "./inputoutput/io_optional_tasks/io_optional_task_second/src/InputOutputOptionalSecond.java";
    private static final String REPLACED_WORD = "public";
    private static final String REPLACEMENT_WORD = "private";

    public static void main(String[] args) {
        File directory = new File(PATH_FOR_NEW_DIRECTORY);
        File file = new File(directory, NAME_OF_NEW_JAVA_PROGRAM);
        directory.mkdir();

        List<String> textOfJavaProgram = readFile();
        writeListToFile(getListWithModifyAccessLevels(textOfJavaProgram), file);
    }

    private static List<String> readFile() {
        try {
            return Files.readAllLines(Path.of(InputOutputOptionalSecond.PATH_JAVA_PROGRAM));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> getListWithModifyAccessLevels(List<String> list) {
        for (String line : list) {
            if (line.contains(REPLACED_WORD))
                list.set(list.indexOf(line), refactoringOfString(replaceWordInString(line)));
        }
        return list;
    }

    private static String replaceWordInString(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(REPLACED_WORD)) words[i] = REPLACEMENT_WORD;
        }
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
