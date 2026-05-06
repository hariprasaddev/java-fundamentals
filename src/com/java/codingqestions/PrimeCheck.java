package com.java.codingqestions;

import java.util.Scanner;

public class PrimeCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int number = sc.nextInt();
        if (number <= 1){
            System.out.println("Not prime");
            return;

        }
        boolean flag = true;
        for (int i =2; i<= Math.sqrt(number); i++) {
            if(number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
        sc.close();

    }
}
