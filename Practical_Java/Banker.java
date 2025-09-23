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

        System.out.println("====== MENU =======\n"
                          +"1. Check Balance \n"
                         + "2. Deposit Money \n"
                         + "3. Withdraw Money \n"
                         + "4. Exit\n"
                         + "===================");

        sc.close();
    }
}