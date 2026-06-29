package com.java.oops;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {
        Product p1;
        p1= new Product();
        p1.id = 101;
        p1.name = "i Qz9 s pro";
        p1.maxRetailPrice = 79999.00;
        p1.discountPercentage = 10.0f;
        p1.isAvailable = true;
        p1.stateTax = 0.9f;
        p1.centralTax = 0.8f;

        System.out.println("id:" + p1.id);
        System.out.println("name:" + p1.name);
        System.out.println("maxRetailPrice:" +  p1.maxRetailPrice);
        System.out.println("discountPercentage:" + p1.discountPercentage);
        System.out.println("isAvailable:" + p1.isAvailable);
        System.out.println("stateTax:" + p1.stateTax);
        System.out.println("centralTax:" + p1.centralTax);

        Product p2;
        p2= new Product();
        p2.id = 103;
        p2.name = "iphone 15";
        p2.maxRetailPrice = 89999.00;
        p2.discountPercentage = 11.0f;
        p2.isAvailable = false;
        p2.stateTax = 0.7f;
        p2.centralTax = 0.9f;

        System.out.println("\nid:" + p2.id);
        System.out.println("name:" + p2.name);
        System.out.println("maxRetailPrice:" +  p2.maxRetailPrice);
        System.out.println("discountPercentage:" + p2.discountPercentage);
        System.out.println("isAvailable:" + p2.isAvailable);
        System.out.println("stateTax:" + p2.stateTax);
        System.out.println("centralTax:" + p2.centralTax);

        Customer customer = new Customer();
        System.out.println(customer.id);
        System.out.println(customer.name);
        System.out.println(customer.gender);
        System.out.println(customer.emailAddress);
        System.out.println(customer.address);
        System.out.println(customer.age);
        System.out.println(customer.mobileNum);

        Customer customer1 = new Customer(1,"hari",'m',"hari@gmail.com","garrepally",(byte)56,8985256813L);
        System.out.println(customer1.id);
        System.out.println(customer1.name);
        System.out.println(customer1.gender);
        System.out.println(customer1.emailAddress);
        System.out.println(customer1.address);
        System.out.println(customer1.age);
        System.out.println(customer1.mobileNum);


    }





}
