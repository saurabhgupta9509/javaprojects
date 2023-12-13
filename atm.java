

import java.util.Scanner;

class atm1 {
    int pin = 1234;
    int balance = 100000;

    void print1() {
        System.out.println(" 1. check balance: ");
        System.out.println(" 2. withdrawal amount : ");
        System.out.println(" 3. deposit amount  : ");
        System.out.println(" 4. change pin : ");
        System.out.println(" 5. exit: ");
    }

    atm1(int choice, int pin2, int amount) {
        switch (choice) {
            case 1:
                System.out.println("Enter the pin: " + pin2);
                if (pin == pin2) {
                    System.out.println("Your balance is: " + balance);
                } else {
                    System.out.println("Incorrect pin");
                }
                break;

            case 2:
                System.out.println("Enter the pin: " + pin2);
                if (pin == pin2) {
                    System.out.println("Withdrawal amount: " + amount);
                    if (balance >= amount) {
                        balance -= amount;
                        System.out.println("The total balance is: " + balance);
                        System.out.println("The withdrawal is successful!");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                }
                 else {
                    System.out.println("Incorrect pin");
                }
                break;

            case 3:
                System.out.println("Enter the pin: " + pin2);
                if (pin == pin2) {
                    System.out.println("Enter the deposit amount: " + amount);
                    balance += amount;
                    System.out.println("The amount is deposited successfully.");
                    System.out.println("Total amount is: " + balance);
                } else {
                    System.out.println("Incorrect pin");
                }
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM machine!");
        System.out.println("Enter the choice: ");
        int choice = sc.nextInt();

        System.out.println("Enter the pin: ");
        int pin2 = sc.nextInt();

        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();

        atm1 a = new atm1(choice, pin2, amount);
        a.print1();
    }
}