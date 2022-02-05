package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_2 {
    public static void main(String[] args){

        //Print the ASCII value of any character user provides

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character :- ");
        char a = sc.next().charAt(0);

        //Storing the ASCII value of char a in char_value
        int char_value = a;

        System.out.println("The ASCII value of "+a+" is "+char_value);

    }
}
