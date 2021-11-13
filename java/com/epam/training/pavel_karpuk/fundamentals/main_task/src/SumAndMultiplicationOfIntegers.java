import java.util.Scanner;

public class SumAndMultiplicationOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int multiplication = 1;
        int numberOfNumbers;
        System.out.println("How many numbers do you want to count?");
        numberOfNumbers = scanner.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Enter an integer number: ");
            int number = scanner.nextInt();
            amount += number;
            multiplication *= number;
        }
        System.out.println("The amount of all the numbers is equal to " + amount);
        System.out.println("Multiplication of all numbers is equal to " + multiplication);
    }
}