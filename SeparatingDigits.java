package com.exercise.chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five (5) digit number, e.g 13246");
        int value = input.nextInt();
        if (value < 100000 && value > 9999){
            int fifth = value % 10;
            value = value / 10;
            int fourth = value % 10;
            value = value / 10;
            int third = value % 10;
            value = value / 10;
            int second = value % 10;
            value = value / 10;
            int first = value % 10;
            System.out.printf("%d %d %d %d %d ", first, second, third, fourth, fifth);
        }else
            System.out.println("invalid input");
    }
}
