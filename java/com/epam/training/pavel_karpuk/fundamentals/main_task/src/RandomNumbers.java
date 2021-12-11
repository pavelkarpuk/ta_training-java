import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of numbers: ");
        int countOfRandomNumbers = scanner.nextInt();
        int[] listOfNumbers = new int[countOfRandomNumbers];
        for (int i = 0; i < countOfRandomNumbers; i++) listOfNumbers[i] = random.nextInt();
        for (int number : listOfNumbers) System.out.print(number + " ");
        System.out.println();
        System.out.println();
        for (int number : listOfNumbers) System.out.println(number);
    }
}