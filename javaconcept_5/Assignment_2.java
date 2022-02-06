package com.company.javaconcept_5;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args) {

        //WAP to check whether given number is 10,20,30,40,50 or not any of these using ternary operator.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 50 :- ");
        int a = sc.nextInt();

        String ans = a==10?a+" is equal to 10":a==20?a+" is equal to 20":a==30?a+" is equal to 30":a==40?a+" is equal to 40":a==50?a+" is equal to 50":"No match";

        System.out.println(ans);
    }
}
