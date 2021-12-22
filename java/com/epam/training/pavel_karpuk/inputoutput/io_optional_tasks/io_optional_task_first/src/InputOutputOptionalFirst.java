import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class InputOutputOptionalFirst {
    public static void main(String[] args) throws IOException {
        File directory = new File("./inputoutput/io_optional_tasks/io_optional_task_first/data");
        File file = new File(directory, "firstOptionalTask.txt");
        directory.mkdir();
        file.createNewFile();

        writeListToFile(convertIntArrayToStringList(getRandomIntArray()), file);
        List<String> randomStringList = getListWithNumbersFromFile(file);
        List<Integer> randomIntList = convertStringListToIntegerList(randomStringList);
        sortListInAscendingOrder(randomIntList);
        List<String> sortStringList = convertIntegerListToStringList(randomIntList);
        writeListToFile(sortStringList, file);
    }

    private static int[] getRandomIntArray() {
        Random random = new Random();
        int[] randomIntArray = new int[10];
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = random.nextInt();
        }
        return randomIntArray;
    }

    private static List<String> convertIntArrayToStringList(int[] randomIntArray) {
        List<String> randomStringList = new ArrayList<>();
        for (int number : randomIntArray) {
            randomStringList.add(String.valueOf(number));
        }
        return randomStringList;
    }

    private static void writeListToFile(List<String> randomStringList, File file) throws IOException {
        Files.write(Path.of(file.getPath()), randomStringList);
    }

    private static List<String> getListWithNumbersFromFile(File file) throws IOException {
        return Files.readAllLines(Path.of(file.getPath()));
    }

    private static List<Integer> convertStringListToIntegerList(List<String> randomStringList) {
        List<Integer> randomIntList = new ArrayList<>();
        for (String number : randomStringList) {
            randomIntList.add(Integer.valueOf(number));
        }
        return randomIntList;
    }

    private static void sortListInAscendingOrder(List<Integer> randomIntList) {
        Collections.sort(randomIntList);
    }

    private static List<String> convertIntegerListToStringList(List<Integer> randomIntList) {
        List<String> randomStringList = new ArrayList<>();
        for (Integer number : randomIntList) {
            randomStringList.add(String.valueOf(number));
        }
        return randomStringList;
    }
}
