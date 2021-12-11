import java.util.Scanner;

public class Month {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int numberOfMonth = scanner.nextInt();
        setMonth(numberOfMonth);
    }

    static void setMonth(int a) {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String monthInArray;
        try {
            monthInArray = month[a - 1];
            System.out.println("This month is " + monthInArray + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is no such month. Let's try again.");
        }
    }
}