package com.java.codingqestions;

import java.util.Scanner;

public class FibonacciNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");

        int N = sc.nextInt();
        int a = 0, b = 1;
        if(N == 1){
            System.out.println(a);
        } else if (N == 2) {
            System.out.println(b);

        } else {
            int c = 0;
            for (int i = 3; i<= N; i++){
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
        sc.close();

    }
}
