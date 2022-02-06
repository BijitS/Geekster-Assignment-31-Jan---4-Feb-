package com.company.javaconcept_5;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args) {

        // write a program to print given character is vowel or Consonant using ternary operator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character :- ");
        char a = sc.next().charAt(0);

        String ans = ((a == 'a') || (a == 'A') || (a == 'e') || (a == 'E') || (a == 'i') || (a == 'I') || (a == 'o') || (a == 'O') || (a == 'u') || (a == 'U')) ? a+" is vowel": a+" is consonant";

        System.out.println(ans);
    }
}
