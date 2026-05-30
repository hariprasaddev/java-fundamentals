package com.java.codingqestions;

import java.util.Scanner;

public class DigitalRoot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        while (number >= 10) {
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }

            number = sum;
        }

        System.out.println("Digital Root = " + number);

        sc.close();
    }
}

