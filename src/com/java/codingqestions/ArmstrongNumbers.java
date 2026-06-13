package com.java.codingqestions;

import java.util.Scanner;

public class ArmstrongNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        int N = sc.nextInt();
        for(int num = 1; num <= N; num++){
            int temp = num;
            int sum = 0;
            int count = 0;
            int temp2 = num;

            while (temp2 > 0){
                temp2 /= 10;
                count++;

            }
            while (temp > 0){
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        sc.close();

    }
}
