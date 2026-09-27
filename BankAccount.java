import java.util.Scanner;
//this program creates a bank account for the user and has minimal feAtures

public class BankAccount { 
    public static double deposit(double balance, double amount){
        return balance + amount;
    }
    public static double withdraw(double balance, double amount){
        if(amount > balance){
            return balance;
        }else return balance - amount;
    }
    public static double CalcFeePercentage(double balance, double threshold){
        return balance / threshold;
    }
   public static void main(String[] var0) {
    Scanner scanner = new Scanner(System.in);
    double balance = 0;
    int input = -1;

    System.out.println("Welcome. Enter one of the following commands: ");
    System.out.println("1: deposit money");
    System.out.println("2: withdraw money");
    System.out.println("3: calcualte fee percentage");
    System.out.println("4: check balance");
    System.out.println("0: exit");

    while(input != 0){
        System.out.print("enter next action: ");
        input = scanner.nextInt();
        switch(input){
            case 1: 
                //deposit
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                balance = deposit(balance, amount); 
                break;
            case 2: 
                //withdrawl
                System.out.print("Enter withdrawl amount: ");
                amount = scanner.nextDouble();
                balance = withdraw(balance, amount);
                break;
            case 3:
                //calculation of fee percentage
                System.out.print("Enter threshold: ");
                double threshold = scanner.nextDouble();
                System.out.println("Your fee percentage: " + (int) CalcFeePercentage(balance, threshold) + "%");
                break;
            case 4: System.out.printf("Your balance: %.2lf", balance); break;
            case 0:
                break;
            default: System.out.println("invalid."); break;
        }
    }
    scanner.close();
    return;
    }
}
