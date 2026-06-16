package com.java.codingqestions;

import java.util.Scanner;

public class EvenDigitSumNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int N = sc.nextInt();

        for (int num = 1; num <= N; num++){
            int temp = num;
            int sum = 0;

            while (temp > 0){
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if (sum % 2 == 0){
                System.out.println(num);
            }
        }
        sc.close();
    }

}
