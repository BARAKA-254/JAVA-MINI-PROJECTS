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

        System.out.print("Choose one of the following operations: (+,-,*,/): ");
        operator = scanner.nextLine();
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");;
        num2 = scanner.nextDouble();

        
        result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);

        scanner.close();
                
    }
    
   public static double calculate(double num1, double num2, String operator){

        if(operator.equals("-")){
            if(num1 > num2){
                return num1 - num2;
            }
            else{
                return num2 - num1;
            }
        }

        else{
            return switch(operator){

                case "+" -> num1 + num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default ->  0;
            };
        }
    }
}
