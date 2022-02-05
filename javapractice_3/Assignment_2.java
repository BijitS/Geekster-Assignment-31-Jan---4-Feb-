package com.company.javapractice_3;
import java.util.Scanner;
public class Assignment_2 {

    /*Apply do while loop to calculate factorial of a number such that, program asks  user
       if he wants to continue, if yes, program should run again*/

    private static Scanner sc = new Scanner(System.in);

    private static void calculate()
    {
        System.out.print("Enter a number: ");
        long N = sc.nextLong();
        int a = 1;
        long fact = 1;
        do
        {
            fact = fact * a;
            a++;
        } while (a <= N);

        System.out.print("The value of " + N + "! is " + fact);
    }
    public static void main(String args[])
    {
        while(true)
        {
            calculate();

            System.out.println("\nWould you like to calculate another number? (type 'yes'): ");

            String input = sc.next();

            if (!input.equals("yes"))

                break;

        }
        System.out.println("END");

    }
}
