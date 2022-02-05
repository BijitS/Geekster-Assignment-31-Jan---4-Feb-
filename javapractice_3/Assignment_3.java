package com.company.javapractice_3;
import java.util.Scanner;
public class Assignment_3 {

    /*WAP to create a function that check if no. is odd or even. call this function from main method*/

    public static void answer(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :- ");
        int a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("The number "+a+" is even");
        }
        else
        {
            System.out.println("The number "+a+" is odd");
        }

    }
    public static void main(String[] args) {

        answer();
    }
}
