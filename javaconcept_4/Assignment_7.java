package com.company.javaconcept4;
import java.util.Scanner;
public class Assignment_7 {
    public static void main(String[] args)
    {
        //Take String input as Name of the city and convert it to reverse string and show on the console.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a city name ");
        String cityname = sc.next();

        String reverse = " ";
        char a;

        for(int i = 0; i<cityname.length(); i++ )
        {
            a = cityname.charAt(i);
            reverse = a+reverse;
        }
        System.out.println(reverse);


    }
}
