package com.java.codingqestions;

import java.util.Scanner;

public class PalindromeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int N = sc.nextInt();

        for (int num = 1; num <= N; num++){
            int temp = num;
            int reverse = 0;

            while (temp > 0){
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }
            if (reverse == num) {
                System.out.println(num+ "");
            }
        }
        sc.close();

    }
}
