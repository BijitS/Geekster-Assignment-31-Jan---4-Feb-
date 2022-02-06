package com.company.javaconcept_5;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args) {

      //write a program to print name of the month by passing number of the month using ternary operator.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from 1 to 12");
        int a = sc.nextInt();

        String ans = a==1?"January":a==2?"February":a==3?"March":a==4?"April":a==5?"May":a==6?"June":a==7?"July":a==8?"August":a==9?"September":a==10?"October":a==11?"November":a==12?"December":"Invalid number";

        System.out.println(ans);
    }
}
