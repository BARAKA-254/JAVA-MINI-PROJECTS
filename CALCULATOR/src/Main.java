import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String operator;
        double num1;
        double num2;
        double result;

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


        if(operator.equals("+")){
            result = add(num1, num2);
            System.out.println("Result: " + result);
        }
        else if(operator.equals("-")){
            result = subtract(num1, num2);
            System.out.println("Result: " + result);
        }
        

        scanner.close();
                
    }
    
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double subtract(double num1, double num2){
        if(num2 > num1){
            return num2 - num1;
        }
        else{
            return num1 -num2;
        }
    }

   
}
