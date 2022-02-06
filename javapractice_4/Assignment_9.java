package com.company.javapractice_4;

public class Assignment_9 {
    public static void main(String[] args) {

        //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
        // write a program to calculate his total marks and percentage marks.

        int sub1 = 78;

        int sub2 = 45;

        int sub3 = 62;

        int total = sub1 + sub2 + sub3;

        float percentage = ((float)total / 300)*100;

        System.out.println("Total "+total+" Percentage "+percentage);

    }
}
