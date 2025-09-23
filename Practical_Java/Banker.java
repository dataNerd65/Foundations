import java.util.Scanner;

public class Banker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.println("**** Welcome To ABSA ATM ****\n");
        String customerName;

        System.out.print("Enter your name:  ");
        customerName = sc.nextLine();
        System.out.println();

        System.out.printf("Hello there %s!%n", customerName);

        System.out.println("What would you like to do today?\n");

        int choice;
        double balance = 0.00; // starting balance

        do { 
            System.out.println("====== MENU =======\n"
                          +"1. Check Balance \n"
                         + "2. Deposit Money \n"
                         + "3. Withdraw Money \n"
                         + "4. Exit\n"
                         + "===================\n");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.printf("Your current balance is $%.2f%n", balance);
                break;
            case 2:
                System.out.print("Enter amount you wish to deposit: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.printf("$%.2f deposited. New balance: $%.2f%n", deposit, balance);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if(withdraw > balance){
                    System.out.println("Insufficient funds.");
                }else{
                    balance -= withdraw;
                    System.out.printf("$%.2f withdrawn. new balance: $%.2f%n", withdraw, balance);
                }
                break;
            case 4:
                System.out.println("Thank you for banking with ABSA. Have a great day!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");   
        }
        } while (choice != 4);

        sc.close();
    }
}