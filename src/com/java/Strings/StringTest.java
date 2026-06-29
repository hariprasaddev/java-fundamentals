package com.java.Strings;

public class StringTest {
    StringTest(){
        System.out.println("My String constructor");

    }
    public static void main (String[] args){
        StringTest str = new StringTest();
       /* Product product = new Product();
        System.out.println(product);*/
        System.out.println(str);

        String str1 = new String();
        System.out.println("Str1:" + str1);
        char[] chars = { 'a','b','c'};
        String str2 = new String(chars);
        System.out.println("str2:" + str2);
        String str3 = new String("abc");
        System.out.println("str3:" + str3);
        String str4 = str2;
        System.out.println("str4:" + str4);
        System.out.println(str2 == str4);
        System.out.println(str2 == str3);

        String str5 = "abc";
        String str6 = "abc";
        System.out.println(str5 == str6);

        System.out.println(chars.length);
        System.out.println(str5.length());
        System.out.println(str5.charAt(1));
        System.out.println(str5.compareToIgnoreCase("aBc"));
        String name = "john";

        name = name.concat(",how are you?");
        System.out.println(name);
        String username = "abc:xyz";
        String pasword = "abcd@123";
        if (username.isEmpty() || pasword.isEmpty()) {
            System.out.println("Enter the details");

        }
        if (username.equalsIgnoreCase("MaDhu") && pasword.equals("abc@123"))
            System.out.println("login successful");
        else
            System.out.println("login failed ! Invalid Credentials");
        String usernamePattern = "^[a-zA-Z0-9_]{4,15}$";
            System.out.println(username.matches(usernamePattern));

        String customerData = "1,JohnDoe,johndoe@gmail.com,123-456-789";
        String[] data = customerData.split(",");
        Customer customer = new Customer();

        customer.id = Integer.parseInt(data[0]);
        customer.name = data[1];
        customer.email = data[2];
        customer.phone = data[3];
        System.out.println("customer Id:" + customer.id);
        System.out.println("name:" + customer.name);
        System.out.println("email:" + customer.email);
        System.out.println("phone:" + customer.phone);

        String password1 = "       Abcd @123     ";
        System.out.println(password1.length());
        System.out.println(password1.trim().length());
        int phoneNo = 324234;
        System.out.println(String.valueOf(phoneNo));
        String file = "resume.pdf";

        System.out.println(file.startsWith("res"));
        System.out.println(file.endsWith(".pdf"));
        String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));





    }
}
