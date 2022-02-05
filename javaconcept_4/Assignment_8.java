package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_8 {
    public static void main(String[] args)
    {
        //Check if a string is palindrome or not. eg. input : ABCBA "

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :- ");
        String input = sc.next();

        String reverse = "";
        char a;

        for(int i = 0; i<input.length(); i++)
        {
            a = input.charAt(i);
            reverse = a+reverse;
        }
        if (input.compareTo(reverse)==0)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
}
