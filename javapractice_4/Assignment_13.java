package com.company.javapractice_4;
import java.util.Scanner;
public class Assignment_13 {
    public static void main(String[] args) {

        //Write a program to calculate the sum of the first and the second last digit of a 5 digit.
        //E.g.- NUMBER : 12345        OUTPUT : 1+4=5

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number : ");
        int n = sc.nextInt();

        int first = n/10000;
        n = n%10000;

        int second = n/1000;
        n = n%1000;

        int third = n/100;
        n = n%100;

        int forth = n/10;

        int fifth = n%10;

        int sum = first + forth;

        System.out.println("sum : "+sum);



    }
}
