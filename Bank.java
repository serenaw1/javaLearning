import java.util.Scanner;
//this program creates a bank account for the user and has minimal feAtures
public class Bank {
    double balance, amount, threshold;

    public Bank(){
        balance = 0;
    }

    public void deposit(double amount){
        balance += amount; return;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("\nFailed! (Not enough balance)");
            return;
        }else balance -= amount; return;
    }
    public double CalcFeePercentage(double threshold){
        return balance / threshold; 
    }
    /*------------------------------------------------------------------------------*/
    public static void main(String[] var0) {
        Scanner scanner = new Scanner(System.in);
        Bank myBankAccount = new Bank();
        int input = -1;
        double amount = 0;

        System.out.println("Welcome. Enter one of the following commands: ");
        System.out.println("1: deposit money");
        System.out.println("2: withdraw money");
        System.out.println("3: calcualte fee percentage");
        System.out.println("4: check balance");
        System.out.println("0: exit");

        while(input != 0){
            System.out.print("\nenter next action: ");
            input = scanner.nextInt();
            switch(input){
                case 1: 
                    //deposit
                    System.out.print("Enter deposit amount: ");
                    amount = scanner.nextDouble();
                    myBankAccount.deposit(amount); 
                    break;
                case 2: 
                    //withdrawl
                    System.out.print("Enter withdrawl amount: ");
                    amount = scanner.nextDouble();
                    myBankAccount.withdraw(amount);
                    break;
                case 3:
                    //calculation of fee percentage
                    System.out.print("Enter threshold: ");
                    double threshold = scanner.nextDouble();
                    System.out.println("Your fee percentage: " + (int) myBankAccount.CalcFeePercentage(threshold) + "%");
                    break;
                case 4: System.out.printf("Your balance: %.2f", myBankAccount.balance); break;
                case 0:
                    break;
                default: System.out.println("invalid."); break;
            }
        }
        scanner.close();
        return;
    }
}
