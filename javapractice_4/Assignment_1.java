package com.company.javapractice_4;

public class Assignment_1 {
    public static void main(String[] args) {

        //Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.

        int length = 5;
        int breadth = 7;

        int area_rectangle = length*breadth;
        int perimeter_rectangle = 2*(length+breadth);

        System.out.println("Area of rectangle : "+area_rectangle);

        System.out.println("Perimeter of rectangle : "+perimeter_rectangle);
    }
}
