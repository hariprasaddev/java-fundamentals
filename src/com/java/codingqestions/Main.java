package com.java.codingqestions;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long num = 0;
        for(int i = 1; i <= N; i++){
            num = num * 10 + 1;
            System.out.println(num);
        }
        sc.close();
    }
}
