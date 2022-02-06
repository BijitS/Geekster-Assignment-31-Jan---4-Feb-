package com.company.javapractice_4;

public class Assignment_6 {
    public static void main(String[] args) {

        //Write a program to print the power of 7 raised to 5.

        int base = 7;

        int power = 5;

        int ans = 1;

        for(int i = 1; i<=power; i++)
        {
            ans = ans*base;
        }
        System.out.println(ans);

        //System.out.println(Math.pow(7,5));

    }
}
