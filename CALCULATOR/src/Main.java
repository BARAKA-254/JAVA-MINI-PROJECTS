import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String operator;
        double num1;
        double num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("**WELCOME TO ARITHMETIC CALCULATOR**");
        System.out.println("************************************");

        System.out.print("Choose one of the following operations: (+,-,*,): ");
        operator = scanner.nextLine();
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");;
        num2 = scanner.nextDouble();

        scanner.close();
    }
}
