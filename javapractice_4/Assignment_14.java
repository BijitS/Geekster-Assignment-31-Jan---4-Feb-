package com.company.javapractice_4;
import java.util.Scanner;
public class Assignment_14 {
    public static void main(String[] args) {

        //Take a 4-digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
        //For example, if the number which was taken is 5696, then the displayed number should be 7818.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 4 digit number ");
        int n = sc.nextInt();

        int  one, two, three, four;

        one   = (n / 1000) + 2;
        n     = (n % 1000) ;
        two   = (n / 100)+2 ;
        n     = (n % 100) ;
        three = (n / 10) +2;
        n     = (n % 10) ;
        four  = (n / 1) +2;


        int ans = (one * 1000) + (two * 100) + (three * 10) + four;
        System.out.println(ans);
    }
}
