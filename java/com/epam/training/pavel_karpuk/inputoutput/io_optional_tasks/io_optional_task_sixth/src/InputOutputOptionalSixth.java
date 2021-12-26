import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputOutputOptionalSixth {
    private static String pathFile = "./inputoutput/io_optional_tasks/io_optional_task_sixth/data/text.txt";

    public static void main(String[] args) throws IOException {
        List<String> text = readFile(pathFile);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter one of the data types: Character, String, Integer, Double.");
            String dataType = scanner.nextLine();
            System.out.println(getListWithSetDataType(dataType, text));
        }
    }

    private static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    private static List<String> getListWithSetDataType(String dataType, List<String> text) {
        if (dataType.equals("Character") || dataType.equals("character") || dataType.equals("char"))
            return getListWithCharacter(text);
        if (dataType.equals("String") || dataType.equals("string"))
            return getListWithString(text);
        if (dataType.equals("Integer") || dataType.equals("integer") || dataType.equals("int"))
            return getListWithInteger(text);
        if (dataType.equals("Double") || dataType.equals("double"))
            return getListWithDouble(text);
        return null;
    }

    private static List<String> getListWithCharacter(List<String> text) {
        List<String> listWithCharacters = new ArrayList<>();
        for (String line : text) {
            if (line.matches("\\D")) listWithCharacters.add(line);
        }
        return listWithCharacters;
    }

    private static List<String> getListWithString(List<String> text) {
        List<String> listWithString = new ArrayList<>();
        for (String line : text) {
            if (line.matches("\\D++") && !line.matches("\\D")) listWithString.add(line);
        }
        return listWithString;
    }

    private static List<String> getListWithInteger(List<String> text) {
        List<String> listWithInteger = new ArrayList<>();
        for (String line : text) {
            if (line.matches("\\d+")) listWithInteger.add(line);
        }
        return listWithInteger;
    }

    private static List<String> getListWithDouble(List<String> text) {
        List<String> listWithDouble = new ArrayList<>();
        for (String line : text) {
            if (line.matches("\\d*[.]\\d+")) listWithDouble.add(line);
        }
        return listWithDouble;
    }
}
