import java.util.Scanner;

class ATM {
    int balance, cashDeposit, cashWithdraw;
    String userName;
    Scanner sc = new Scanner(System.in);

    public ATM(Scanner sc) {
        System.out.println("Welcome to the ATM");
        System.out.println("Please Enter your Name ");
        userName = sc.nextLine();
        balance = 0;
        System.out.println("Hello " + userName);
    }

    public void depositCash() {
        System.out.println("Enter amount to deposit: ");
        cashDeposit = sc.nextInt();
        int amount = cashDeposit;
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited your cash $" + amount);
            System.out.println("Your updated balance is $" + balance);
        }
    }

    public void withdrawCash() {
        System.out.println("Enter amount to withdraw: ");
        cashWithdraw = sc.nextInt();
        int amount = cashWithdraw;
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdraw $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient Balance ");
        }
    }

    public void balanceInfo() {
        System.out.println("Your balance is $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(sc);

        boolean exit = false;

        while (!exit) {
            System.out.println("Please choose an option : ");
            System.out.println("1. Deposit Cash");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    atm.depositCash();
                    break;

                case 2:
                    atm.withdrawCash();
                    break;

                case 3:
                    atm.balanceInfo();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Thanku for Choosing Atm ");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}