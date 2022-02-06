package com.company.javapractice_4;

public class Assignment_12 {
    public static void main(String[] args) {

        //The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A'
        // out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.

        int total_students = 90;

        int boys = 45;

        int total_students_gradeA = total_students*50/100;

        int boys_gradeA = 20;

        int girls_gradeA = total_students_gradeA-boys_gradeA;

        System.out.println("Girls with grade A : "+girls_gradeA);

    }
}
