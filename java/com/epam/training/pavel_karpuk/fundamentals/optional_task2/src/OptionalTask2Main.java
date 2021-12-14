import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OptionalTask2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        try {
            System.out.println("Enter the size of the square matrix: ");
            n = scanner.nextInt();
            System.out.println("Enter the value M (where -M and M are the interval of matrix values): ");
            m = scanner.nextInt();
            System.out.println("Enter the column (row) number of the matrix to be ordered in increasing order: ");
            k = scanner.nextInt() - 1;
        } catch (RuntimeException e) {
            throw new RuntimeException("You should enter positive integer numbers.");
        }
        int[][] randomMatrix = getRandomMatrix(n,m);
        printMatrix(randomMatrix);
        System.out.println();
        System.out.println("Ordered rows of the matrix in increasing order of the values of the elements of " + (k + 1) + " column: ");
        printMatrix(getOrderedMatrixRowsInIncreasingElementsOrderCertainColumn(randomMatrix, k));
        System.out.println();
        System.out.println("Ordered columns of the matrix in increasing order of the values of the elements of " + (k + 1) + " row: ");
        printMatrix(getOrderedMatrixColumnsInIncreasingElementsOrderCertainRow(randomMatrix, k));
        int maxMatrixElement = getMaxMatrixElement(randomMatrix);
        System.out.println();
        System.out.println("The maximum element of the matrix: " + maxMatrixElement);
        System.out.println();
        System.out.println("A new matrix after deleting all rows and columns containing the maximum element: ");
        printMatrix(getMatrixWithoutRowsAndColumnsWithMaxElement(randomMatrix, maxMatrixElement));
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] getRandomMatrix (int n, int m) {
        int[][] randomMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                randomMatrix [i][j] = (int)(Math.random() * (m - (-m)) + (-m));
            }
        }
        return randomMatrix;
    }

//Упорядочивание строк матрицы в порядке возрастания значений элементов k-ого столбца
    public static int[][] getOrderedMatrixRowsInIncreasingElementsOrderCertainColumn(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][k] > matrix[j][k]) {
                    for (int l = 0; l < matrix.length; l++) {
                        int temp = matrix[i][l];
                        matrix[i][l] = matrix[j][l];
                        matrix[j][l] = temp;
                    }
                }
            }
        }
        return matrix;
    }

//Упорядочивание столбцов матрицы в порядке возрастания значений элементов k-ой строки
    public static int[][] getOrderedMatrixColumnsInIncreasingElementsOrderCertainRow(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[k][i] > matrix[k][j]) {
                    for (int l = 0; l < matrix.length; l++) {
                        int temp = matrix[l][i];
                        matrix[l][i] = matrix[l][j];
                        matrix[l][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int getMaxMatrixElement(int[][] matrix) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    public static int[][] getMatrixWithoutRowsAndColumnsWithMaxElement(int[][] matrix, int max) {
        List<Integer> rowNumbers = new ArrayList<>();
        List<Integer> columnNumbers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == max) {
                    if(!rowNumbers.contains(i))
                        rowNumbers.add(i);
                    if(!columnNumbers.contains(j))
                        columnNumbers.add(j);
                }
            }
        }

        int [][] matrixAfterDeleteRowsAndColumns = new int[matrix.length - rowNumbers.size()][matrix.length - columnNumbers.size()];
        int tempIForNewMatrix = 0;
        int tempJForNewMatrix = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (!rowNumbers.contains(i)) {
                tempJForNewMatrix = 0;
                for (int j = 0; j < matrix.length; j++) {
                    if (!columnNumbers.contains(j)) {
                        matrixAfterDeleteRowsAndColumns[tempIForNewMatrix][tempJForNewMatrix] = matrix[i][j];
                        tempJForNewMatrix++;
                    }
                }
                tempIForNewMatrix++;
            }
        }
        return matrixAfterDeleteRowsAndColumns;
    }
}
