package com.java.codingqestions;

import java.util.Scanner;

public class SeriesGeneration {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num:");

        int N = sc.nextInt();
        for (int i = 1; i<=N; i++){
            System.out.println(i * (i + 1));
        }
        sc.close();
    }
}
