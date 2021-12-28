import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class InputOutputOptionalFirst {
    private static final String PATH_FOR_NEW_DIRECTORY = "./inputoutput/io_optional_tasks/io_optional_task_first/data";
    private static final String NAME_TXT_FILE = "firstOptionalTask.txt";

    public static void main(String[] args) {
        File directory = new File(PATH_FOR_NEW_DIRECTORY);
        File file = new File(directory, NAME_TXT_FILE);
        directory.mkdir();

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

    private static List<String> convertIntArrayToStringList(int[] intArray) {
        List<String> stringList = new ArrayList<>();
        for (int number : intArray) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    private static void writeListToFile(List<String> stringList, File file) {
        try {
            Files.write(Path.of(file.getPath()), stringList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<String> getListWithNumbersFromFile(File file) {
        try {
            return Files.readAllLines(Path.of(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Integer> convertStringListToIntegerList(List<String> stringList) {
        List<Integer> intList = new ArrayList<>();
        for (String number : stringList) {
            intList.add(Integer.valueOf(number));
        }
        return intList;
    }

    private static void sortListInAscendingOrder(List<Integer> intList) {
        Collections.sort(intList);
    }

    private static List<String> convertIntegerListToStringList(List<Integer> intList) {
        List<String> stringList = new ArrayList<>();
        for (Integer number : intList) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }
}
