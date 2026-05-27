package com.java.codingqestions;

public class FibonacciSeries {
    static void main(String[] args) {


    int n = 7;

    int a = 0;
    int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {

        int c = a + b;

        System.out.print(c + " ");

        a = b;
        b = c;
    }
}
}

