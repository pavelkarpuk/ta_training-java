import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputOutputMain {
    public static void main(String[] args) throws IOException {
//        Ввести с консоли path - условие задачи
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.nextLine();
//        String path = "D:/Music"; //для тестов - директория
        String path = "D:/Music/fileWithFoldersAndFiles.txt"; //для тестов - файл
        String pathTreeFile = "./inputoutput/io_main_task/fileWithFoldersAndFiles.txt";
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File treeFile = new File("./inputoutput/io_main_task" + File.separator + "fileWithFoldersAndFiles.txt");
            treeFile.delete();
            treeFile.createNewFile();
            Files.write(Path.of(pathTreeFile), Collections.singleton(path), StandardOpenOption.APPEND);
            writeFoldersAndFilesToFile(file, pathTreeFile);
        }
        if (file.exists() && file.isFile()) {
            List<String> foldersAndFiles = readFile(path);
            List<String> listFolders = deleteAllUnnecessaryCharFromNames(getListWithFolders(foldersAndFiles));
            List<String> listFiles = deleteAllUnnecessaryCharFromNames(getListWithFiles(foldersAndFiles));
            System.out.println("Number of folders: " + getNumberOfFolders(listFolders));
            System.out.println("Number of files: " + getNumberOfFiles(listFiles));
            System.out.println("Average number of files in a folder: " +
                    getAverageNumberFilesInFolder(getNumberOfFolders(listFolders), getNumberOfFiles(listFiles)));
            System.out.println("The average length of the file name: " + getAverageLengthFileName(listFiles));
        }
    }

    private static void writeFoldersAndFilesToFile(File directory, String pathTreeFile) throws IOException {
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                String fileName = "|" + "\t\t" + file.getName();
                Files.write(Path.of(pathTreeFile), Collections.singleton(fileName), StandardOpenOption.APPEND);
            } else if (file.isDirectory()) {
                Files.write(Path.of(pathTreeFile), Collections.singleton("|"), StandardOpenOption.APPEND);
                String directoryName = "|" + "----" + file.getName();
                Files.write(Path.of(pathTreeFile), Collections.singleton(directoryName), StandardOpenOption.APPEND);
                writeFoldersAndFilesToFile(file, pathTreeFile);
            }
        }
    }

    private static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Path.of(path));
    }

    private static List<String> getListWithFolders(List<String> foldersAndFiles) {
        List<String> listFolders = new ArrayList<>();
        for (String line : foldersAndFiles) {
            if (line.startsWith("|" + "----")) listFolders.add(line);
        }
        return listFolders;
    }

    private static List<String> getListWithFiles(List<String> foldersAndFiles) {
        List<String> listFiles = new ArrayList<>();
        for (String line : foldersAndFiles) {
            if (line.startsWith("|        ")) listFiles.add(line);
        }
        return listFiles;
    }

    private static List<String> deleteAllUnnecessaryCharFromNames(List<String> list) {
        List<String> rightList = new ArrayList<>();
        for (String line : list) {
            line = line.replaceAll("\\|", "");
            line = line.replaceAll("\s", "");
            line = line.replaceAll("-", "");
            rightList.add(line);
        }
        return rightList;
    }

    private static int getNumberOfFolders(List<String> listFolders) {
        return listFolders.size();
    }

    private static int getNumberOfFiles(List<String> listFiles) {
        return listFiles.size();
    }

    private static double getAverageNumberFilesInFolder(int numberOfFolders, int numberOfFiles) {
        return Math.round(((double) numberOfFiles / numberOfFolders) * 10.0) / 10.0;
    }

    private static int getAverageLengthFileName(List<String> listFiles) {
        int totalLength = 0;
        for (String line : listFiles) {
            totalLength += line.length();
        }
        return totalLength / listFiles.size();
    }
}
