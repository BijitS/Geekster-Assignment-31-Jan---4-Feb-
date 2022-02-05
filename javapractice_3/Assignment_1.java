package com.company.javapractice_3;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {

        //WAP to calculate no. of digits in a number entered by user.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        long input = sc.nextLong();

        long temp = input;

        long count = 1;
        for(int i = 0; i<temp; i++)
        {
            temp = temp/10;
            count++;
        }
        System.out.println("Number of digits available in "+input+" is " +count);
    }
}
