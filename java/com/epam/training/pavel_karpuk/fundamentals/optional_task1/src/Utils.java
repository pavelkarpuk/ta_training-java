import java.util.ArrayList;
import java.util.List;

public class Utils {
    public String getLongestNumber(String[] numbers) {
        String longestNumber = numbers[0];
        for (String number : numbers) {
            if (number.length() > longestNumber.length()) {
                longestNumber = number;
            }
        }
        return longestNumber;
    }

    public String getShortestNumber(String[] numbers) {
        String shortestNumber = numbers[0];
        for (String number : numbers) {
            if (number.length() < shortestNumber.length()) {
                shortestNumber = number;
            }
        }
        return shortestNumber;
    }

    public String[] getNumbersInDescendingOrderOfTheirLength(String[] numbers) {
        boolean sorted = false;
        String number;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].length() < numbers[i+1].length()) {
                    number = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = number;
                    sorted = false;
                }
            }
        }
        return numbers;
    }

    public String[] getNumbersInIncreasingOrderOfTheirLength(String[] numbers) {
        boolean sorted = false;
        String number;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i].length() > numbers[i+1].length()) {
                    number = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = number;
                    sorted = false;
                }
            }
        }
        return numbers;
    }

    public int getAverageLengthOfNumbers(String[] numbers) {
        int totalLength = 0;
        for (String number : numbers) {
            totalLength += number.length();
        }
        return totalLength / numbers.length;
    }

    public List<String> getNumbersWhoseLengthIsLessThanAverageLength (String [] numbers) {
        List <String> numbersWhoseLengthIsLessThanAverageLength = new ArrayList<>();
        for (String number : numbers) {
            if (number.length() < getAverageLengthOfNumbers(numbers)) {
                numbersWhoseLengthIsLessThanAverageLength.add(number);
            }
        }
        return numbersWhoseLengthIsLessThanAverageLength;
    }

    public List<String> getNumbersWhoseLengthIsMoreThanAverageLength (String [] numbers) {
        List <String> numbersWhoseLengthIsMoreThanAverageLength = new ArrayList<>();
        for (String number : numbers) {
            if (number.length() > getAverageLengthOfNumbers(numbers)) {
                numbersWhoseLengthIsMoreThanAverageLength.add(number);
            }
        }
        return numbersWhoseLengthIsMoreThanAverageLength;
    }
}