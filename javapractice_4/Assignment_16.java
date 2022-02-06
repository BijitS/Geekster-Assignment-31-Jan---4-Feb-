package com.company.javapractice_4;

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {

        //Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 3 digit number : ");
        int N = sc.nextInt();

        int temp = N;

        int ans = 0;

        for(int i = 1; i<=3; i++)
        {
            int rem = N%10;
            ans = ans*10 + rem;
            N = N/10;
        }
        System.out.println("Reverse of "+temp+" is "+ans);
    }
}
