package com.company.javapractice_4;

public class Assignment_4 {
    public static void main(String[] args) {

        //Write a program to add 8 to the number 2345 and then divide it by 3.
        // Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
        //Now, solve the above question using assignment operators (eg. +=, -=, *=).

        int num = 2345;

        num += 8;

        num /= 3;

        num %= 5;

        num *= 5;

        System.out.println(num);

    }
}
