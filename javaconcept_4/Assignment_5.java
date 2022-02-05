package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_5 {
    public static void main(String[] args){

        //Write a Java program that reads a number in inches, converts it to meters.

        //Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        double inch = sc.nextDouble();

        //Inches to meter
        double meter = inch/39.37;

        //Printing the answer
        System.out.println("Inches to meter of "+inch+" is "+meter);
    }
}
