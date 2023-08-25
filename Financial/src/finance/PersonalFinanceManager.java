package finance;

import java.util.Scanner;

public class PersonalFinanceManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceManager financeManager = new FinanceManager();

        while (true) {
            System.out.println("Personal Finance Manager Menu:");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Display Transactions");
            System.out.println("4. Calculate Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter income description: ");
                    String incomeDesc = scanner.nextLine();
                    System.out.print("Enter income amount: ");
                    double incomeAmount = scanner.nextDouble();
                    financeManager.addTransaction(new Transaction(incomeDesc, incomeAmount));
                    break;
                case 2:
                    System.out.print("Enter expense description: ");
                    String expenseDesc = scanner.nextLine();
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    financeManager.addTransaction(new Transaction(expenseDesc, -expenseAmount));
                    break;
                case 3:
                    financeManager.displayTransactions();
                    break;
                case 4:
                    System.out.println("Balance: $" + financeManager.calculateBalance());
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
