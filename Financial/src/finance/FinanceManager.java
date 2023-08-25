package finance;

import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Transaction> transactions;

    public FinanceManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculateBalance() {
        double balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
        }
        return balance;
    }

    public void displayTransactions() {
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDescription() + ": $" + transaction.getAmount());
        }
    }
}
