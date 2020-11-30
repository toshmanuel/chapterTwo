package com.exercise.chapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle to calculate it diameter, circumference and area of the circle");

        double radius = input.nextInt();

        System.out.printf("perimeter is %.2f, circumference is %.2f, and area is %.2f%n",(2*radius), (2*Math.PI*radius), (radius*radius*Math.PI));
    }
}
