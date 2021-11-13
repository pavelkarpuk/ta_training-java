import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> numberAsStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String numberAsString = scanner.nextLine();
        List<Integer> digits = numberAsString.chars()
                .map(Character::getNumericValue)
                .boxed()
                .collect(Collectors.toList());

        for (Integer digit : digits) numberAsStack.push(digit);

        Collections.reverse(numberAsStack);

        System.out.print("Number in reverse order: ");
        numberAsStack.forEach(System.out::print);
    }
}
