package com.java.codingqestions;

import java.util.Scanner;

public class PrimeNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value:");
        int N = sc.nextInt();
        for (int num = 2; num <= N; num++) {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(num);
            }
        }
        sc.close();
    }
}
