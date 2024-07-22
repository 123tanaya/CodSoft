package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);  // initial balance
        ATM atm = new ATM(account);
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            atm.displayOptions();
            System.out.println("Choose an option:");
            option = scanner.nextInt();
            atm.processOption(option);
        }

        scanner.close();
    }
}
