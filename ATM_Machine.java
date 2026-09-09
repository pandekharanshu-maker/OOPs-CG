package practical;
//Menu Driven ATM Machine
import java.util.*;
class Balance {
    public void display(int balance) {
        System.out.println("Current balance: " + balance);
    }
}
class Deposit {
    public int deposit(int balance, Scanner sc) {
        try {
            System.out.println("Enter the amount you want to deposit: ");
            int deposit = sc.nextInt();
            if (deposit <= 0) {
                throw new IllegalArgumentException("Deposit amount must be greater than 0.");
            }
            balance = balance + deposit;
            System.out.println("Updated balance: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            sc.nextLine(); // Clear invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Deposit operation completed.");
        }
        return balance;
    }
}
class Withdraw {
    public int withdraw(int balance, Scanner sc) {
        try {
            System.out.println("Enter the amount you want to withdraw: ");
            int withdraw = sc.nextInt();
            if (withdraw <= 0) {
                throw new IllegalArgumentException(
                    "Withdrawal amount must be greater than 0."
                );
            }
            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient balance.");
            }
            balance = balance - withdraw;
            System.out.println("Updated balance: " + balance);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number.");
            sc.nextLine(); // Clear invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Withdrawal operation completed.");
        }
        return balance;
    }
}
public class ATM_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int balance = 99999999;
        int choice = 0;
        Balance b = new Balance();
        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        try {
            do {
                try {
                    System.out.println("\n------ Menu ------");
                    System.out.println("1. Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        b.display(balance);
                    }
                    else if (choice == 2) {
                        balance = d.deposit(balance, sc);
                    }
                    else if (choice == 3) {
                        balance = w.withdraw(balance, sc);
                    }
                    else if (choice == 4) {
                        System.out.println("Exiting....");
                    }
                    else {
                        System.out.println("Enter choice between 1 to 4 only.");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a number between 1 and 4.");
                    sc.nextLine(); // Clear invalid input
                }

            } while (choice != 4);

        } finally {
            sc.close();
            System.out.println("Thank you for using our services!!");
        }
    }
}