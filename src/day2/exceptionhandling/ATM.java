package day2.exceptionhandling;

import java.util.Scanner;

public class ATM {
    private static double balance = 1000.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        try {
            double amount = scanner.nextDouble();
            withdraw(amount);
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Invalid input. Please enter a numeric amount.");
        } finally {
            System.out.println("✅ Thank you for using our ATM.");
            scanner.close();
        }
    }
    private static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: ₹" + balance);
        }
        balance -= amount;
    }
}
