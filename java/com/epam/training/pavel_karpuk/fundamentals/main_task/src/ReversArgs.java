import java.util.Scanner;

public class ReversArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; true;) {
            System.out.println("Enter an argument: ");
            StringBuffer stringBuffer = new StringBuffer(scanner.nextLine()).reverse();
            System.out.println("Argument after the reverse: " + stringBuffer);
        }
    }
}