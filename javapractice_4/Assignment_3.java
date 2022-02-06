package com.company.javapractice_4;

public class Assignment_3 {
    public static void main(String[] args) {

        //Write a program to add 8 to the number 2345 and then divide it by 3.
        // Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.

        int num = 2345;

        int ans1 = (num+8)/3;

        int modulus = ans1%5;

        int ans2 = modulus*5;

        System.out.println(ans2);
    }
}
