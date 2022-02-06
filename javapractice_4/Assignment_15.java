package com.company.javapractice_4;
import java.util.Scanner;
public class Assignment_15 {
    public static void main(String[] args) {

        //Write a program to calculate the sum of the digits of a 3-digit number.
        //Number : 132        Output : 6

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int N = sc.nextInt();

        int sum = 0;

        for(int i = 1; i<=3; i++)
        {
            int rem = N%10;
            sum = sum+rem;
            N=N/10;
        }
        System.out.println("Sum of three digit "+sum);
    }
}
