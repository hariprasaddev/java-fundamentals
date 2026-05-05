package com.java.codingqestions;

import java.util.Scanner;

public class LargestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = sc.nextInt();
        int max = 0;

        while (number >0) {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }

            number = number / 10;
        }
        System.out.println("Maximum digit: " + max);
    }
}
