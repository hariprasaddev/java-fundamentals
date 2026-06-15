package com.java.codingqestions;

import java.util.Scanner;

public class OddDigitNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int N = sc.nextInt();
        for (int num = 1; num <= N; num++){
            int temp = num;
            boolean isValid = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit % 2 == 0) {
                        isValid = false;
                        break;
                    }
                    temp /= 10;
                }

                if(isValid) {
                    System.out.println(num + " ");
                }
            }
        }

    }

