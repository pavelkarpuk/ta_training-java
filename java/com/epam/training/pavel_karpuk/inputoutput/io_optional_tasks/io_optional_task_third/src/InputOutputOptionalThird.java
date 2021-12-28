import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class InputOutputOptionalThird {
    private static final String PATH_FOR_NEW_DIRECTORY = "./inputoutput/io_optional_tasks/io_optional_task_third/data";
    private static final String NAME_OF_NEW_JAVA_PROGRAM = "thirdOptionalTask.java";
    private static final String PATH_JAVA_PROGRAM = "./inputoutput/io_optional_tasks/io_optional_task_third/src/InputOutputOptionalThird.java";

    public static void main(String[] args) {
        File directory = new File(PATH_FOR_NEW_DIRECTORY);
        File file = new File(directory, NAME_OF_NEW_JAVA_PROGRAM);
        directory.mkdir();

        List<String> textOfJavaProgram = readFile();
        writeListToFile(getListWithReverseOrderOfEachString(textOfJavaProgram), file);
    }

    private static List<String> readFile() {
        try {
            return Files.readAllLines(Path.of(InputOutputOptionalThird.PATH_JAVA_PROGRAM));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> getListWithReverseOrderOfEachString(List<String> list) {
        for (String line : list) {
            list.set(list.indexOf(line), new StringBuilder(line).reverse().toString());
        }
        return list;
    }

    private static void writeListToFile(List<String> list, File file) {
        try {
            Files.write(Path.of(file.getPath()), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
