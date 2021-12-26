import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class InputOutputOptionalThird {
    private static String pathForNewDirectory = "./inputoutput/io_optional_tasks/io_optional_task_third/data";
    private static String nameOfNewJavaProgram = "thirdOptionalTask.java";
    private static String pathJavaProgram = "./inputoutput/io_optional_tasks/io_optional_task_third/src/InputOutputOptionalThird.java";

    public static void main(String[] args) throws IOException {
        File directory = new File(pathForNewDirectory);
        File file = new File(directory, nameOfNewJavaProgram);
        directory.mkdir();
        file.createNewFile();

        List<String> textOfJavaProgram = readFile(pathJavaProgram);
        writeListToFile(getListWithReverseOrderOfEachString(textOfJavaProgram), file);
    }

    private static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    private static List<String> getListWithReverseOrderOfEachString(List<String> list) {
        for (String line : list) {
            list.set(list.indexOf(line), new StringBuilder(line).reverse().toString());
        }
        return list;
    }

    private static void writeListToFile(List<String> list, File file) throws IOException {
        Files.write(Path.of(file.getPath()), list);
    }
}
