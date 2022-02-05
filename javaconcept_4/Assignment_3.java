package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_3 {
    public static void main(String[] args){

        //Write a program to add 3 to the ASCII value of the any character user provides  and print the equivalent character.

        //Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :- ");
        char a = sc.next().charAt(0);

        //Find the ASCII code of character and add with 3
        int ASCII = a;
        ASCII += 3;

        //Convert the int to char
        char ans = (char)ASCII;

        //Print the character which is equivalent to int ASCII.
        System.out.println("The character equivalent to "+ASCII+" is "+ans);


    }
}
