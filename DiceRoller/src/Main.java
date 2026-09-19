import java.util.Scanner;
import java.util.Random;
public class Main{
  public static void main(String[] args){

    System.out.println("***DICE ROLLING GAME***");
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    System.out.print("How many rolls: ");
    int rolls = scanner.nextInt();
    if (rolls < 0){
      System.out.println("Invalid Input");
    }
    int total = 0;
    for (int i = 0; i < rolls; i++){
      int result = random.nextInt(1,7);
      System.out.println(result);
      total += result;

      switch (result){
        case 1 -> printDieOne();
        case 2 -> printDieTwo();
        case 3 -> printDieThree();
        case 4 -> printDieFour();
        case 5 -> printDieFive();
        case 6 -> printDieSix();
        default -> System.out.println("invalid choice");
      }
    }
    System.out.println("Total: " + total);
    
  }
  public static void printDieOne() {
    System.out.println("-------------");
    System.out.println("|            |");
    System.out.println("|            |");
    System.out.println("|     *      |"); 
    System.out.println("|            |");
    System.out.println("|            |");
    System.out.println("-------------");

  }
  public static void printDieTwo() {
    System.out.println("-------------");
    System.out.println("| *          |");
    System.out.println("|            |");
    System.out.println("|            |"); 
    System.out.println("|            |");
    System.out.println("|          * |");
    System.out.println("-------------");
  }
  public static void printDieThree() {  
    System.out.println("-------------");
    System.out.println("| *          |");
    System.out.println("|            |");
    System.out.println("|     *      |"); 
    System.out.println("|            |");
    System.out.println("|          * |");
    System.out.println("-------------");
  }

  
  public static void printDieFour() {  
    System.out.println("-------------");
    System.out.println("| *        * |");
    System.out.println("|            |");
    System.out.println("|            |"); 
    System.out.println("|            |");
    System.out.println("| *        * |");
    System.out.println("-------------");
  }

  public static void printDieFive() {  
    System.out.println("-------------");
    System.out.println("| *        * |");
    System.out.println("|            |");
    System.out.println("|     *      |"); 
    System.out.println("|            |");
    System.out.println("| *        * |");
    System.out.println("-------------");
  }

  public static void printDieSix() {  
    System.out.println("-------------");
    System.out.println("| *        * |");
    System.out.println("|            |");
    System.out.println("| *        * |"); 
    System.out.println("|            |");
    System.out.println("| *        * |");
    System.out.println("-------------");
  }
}
