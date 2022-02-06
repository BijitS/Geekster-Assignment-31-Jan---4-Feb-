package com.company.javaconcept_5;
import java.util.Scanner;
public class Assignment_4 {
    public static void main(String[] args) {

        /*WAP to check whether given number is lesser or greater than 10 if it's lesser than check further if its lesser or greater than
     5 using ternary operator and Print greater or smaller accordingly.*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 10");
        int a = sc.nextInt();

        String ans = a<=10?a<=5?a+" is less than 5":a+" is greater than 5":a+" is greater than 10";

        System.out.println(ans);
    }
}
