import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of numbers: ");
        int numberOfNumbers = Integer.parseInt(br.readLine());
        System.out.println("Enter the numbers: ");
        String[] numbers = new String[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = String.valueOf(Integer.parseInt(br.readLine()));
        }
        System.out.println("The longest number is: " + utils.getLongestNumber(numbers) + ". Its length is: " + utils.getLongestNumber(numbers).length());
        System.out.println("The shortest number is: " + utils.getShortestNumber(numbers) + ". Its length is: " + utils.getShortestNumber(numbers).length());
        System.out.println("Numbers in descending order of their length: " + Arrays.toString(utils.getNumbersInDescendingOrderOfTheirLength(numbers)));
        System.out.println("Numbers in increasing order of their length: " + Arrays.toString(utils.getNumbersInIncreasingOrderOfTheirLength(numbers)));
        System.out.println("Average length of numbers: " + utils.getAverageLengthOfNumbers(numbers) + " characters");
        System.out.println("Numbers whose length is less than average length: " + utils.getNumbersWhoseLengthIsLessThanAverageLength(numbers));
        System.out.println("Numbers whose length is more than average length: " + utils.getNumbersWhoseLengthIsMoreThanAverageLength(numbers));
    }
}
