import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (; true; ) {
            System.out.println("What is your name? : ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                System.out.println("You didn't enter a name. Try again.");
            } else {
                System.out.println("Hello " + name + "!");
            }
        }
    }
}