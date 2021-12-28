import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class InputOutputMain {
    private static final String PATH_FOR_TXT_FILE = "./inputoutput/io_main_task";
    private static final String NAME_TXT_FILE = "fileWithFoldersAndFiles.txt";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String path = scanner.nextLine();
            File file = new File(path);
            if (file.exists()) {
                if (file.isDirectory()) {
                    File fileLikeTree = new File(PATH_FOR_TXT_FILE + File.separator + NAME_TXT_FILE);
                    try {
                        Files.write(Path.of(fileLikeTree.getPath()), Collections.singleton(path));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    writeFoldersAndFilesToFileLikeTree(file, fileLikeTree.getPath());
                }
                if (file.isFile()) {
                    List<String> foldersAndFiles = readFile(path);
                    List<String> listFolders = deleteAllUnnecessaryCharFromNames(getListWithFolders(foldersAndFiles));
                    List<String> listFiles = deleteAllUnnecessaryCharFromNames(getListWithFiles(foldersAndFiles));
                    System.out.println("Number of folders: " + getNumberOfFolders(listFolders));
                    System.out.println("Number of files: " + getNumberOfFiles(listFiles));
                    System.out.println("Average number of files in the folder: " +
                            getAverageNumberFilesInFolder(getNumberOfFolders(listFolders), getNumberOfFiles(listFiles)));
                    System.out.println("The average length of the file name: " + getAverageLengthFileName(listFiles));
                }
            } else {
                System.out.println("There is no such path.");
            }
        }
    }

    private static String getTextBeforeNameDirectoryOrFile(File file) {
        String textBeforeName = null;
        if (file.isFile()) textBeforeName = "|" + "\t\t";
        if (file.isDirectory()) textBeforeName = "|" + "----";
        return textBeforeName;
    }

    private static void writeFoldersAndFilesToFileLikeTree(File directory, String path) {
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                String fileName = getTextBeforeNameDirectoryOrFile(file) + file.getName();
                try {
                    Files.write(Path.of(path), Collections.singleton(fileName), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (file.isDirectory()) {
                try {
                    Files.write(Path.of(path), Collections.singleton("|"), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String directoryName = getTextBeforeNameDirectoryOrFile(file) + file.getName();
                try {
                    Files.write(Path.of(path), Collections.singleton(directoryName), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                writeFoldersAndFilesToFileLikeTree(file, path);
            }
        }
    }

    private static List<String> readFile(String path) {
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
