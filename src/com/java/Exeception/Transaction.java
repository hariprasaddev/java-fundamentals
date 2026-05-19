package com.java.Exeception;

import java.util.Scanner;

public class Transaction {
    public static void main (String[] args) {
        int availableBalance = 1000;
        String name = " hari";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount = scanner.nextInt();
        /*if (performTransaction(availableBalance, amount)) {
            printTranscation(name, amount);
        }*/

    }

    private static void printTranscation(String name, int amount) {
        System.out.println("Transcation details :" + name + " " + amount);
    }


    private static boolean performTransaction(int availableBalance, int amount) throws InsufficientFundsException {
        if (amount > availableBalance) {
            throw new InsufficientFundsException("Insufficent Funds, max withdrawal amount is: " + availableBalance);

        } else {
            System.out.println("Transaction successful");
            availableBalance -= amount;
        }
        return true;
    }

}
