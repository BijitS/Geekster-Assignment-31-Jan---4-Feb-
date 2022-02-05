package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_6 {
    public static void main(String[] args){
        //Write a Java program to convert minutes into a number of years and days.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your value in minutes");
        int min = sc.nextInt();

        int minutes_in_a_year = 60 * 24 * 365;

        int years = min/minutes_in_a_year;
        int days = (min/60/24)%365;

        System.out.println("Number of years: "+years+" years");
        System.out.println("Number of days "+days+" days");
    }
}
