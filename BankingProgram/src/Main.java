import java.util.Scanner;
class Main {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("*****BANKING PROGRAM*****"); 
    double balance = 0;
    int option = 0;
    while(option != 4) { 
        System.out.println("Options");
        System.out.println("1. Check Balance ");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");;
        System.out.println("4. Exit");
        
        System.out.print("Enter your option: ");
        option =  scanner.nextInt();

      switch (option) {
        case 1 -> checkBalance(balance);
        case 2 -> {
                     balance += deposit();
                     System.out.println("Balance: " + balance);
                  }
        case 3 -> {
                     balance -= withdraw(balance);
                     System.out.println("Balance: " + balance);
                  }
        case 4 -> System.out.println("exiting!!");
        default -> System.out.println("Invalid option");
      }  
    }  
  }

  static void checkBalance(double balance){
    System.out.println("The balance is " + balance +  "\n");
  }

  static double deposit(){
    System.out.print("Amount to deposit: ");
    double amount = scanner.nextDouble();

    if(amount < 0){
      System.out.println("Cannot deposit a negative amount!!");
      return 0.0;
    }

    System.out.println("You have deposited " + amount );
    return amount; 
  }

  static double withdraw(double balance){
    System.out.print("Enter Amount to withraw: ");
    double amount = scanner.nextDouble();

    if (amount > balance){
      System.out.println("Insufficient balance!!");
      return 0.0;
    }
    return amount; 

  }
}
