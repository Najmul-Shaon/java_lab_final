import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int diff = firstNumber - secondNumber;

        System.out.println("The difference between " + firstNumber + " and " + secondNumber + " is " + diff);

        scanner.close();
    }
}
