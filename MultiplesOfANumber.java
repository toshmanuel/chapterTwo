package com.exercise.chapterTwo;

import java.util.Scanner;

public class MultiplesOfANumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer value");

        int firstValue = input.nextInt();

        System.out.println("Enter second integer value");

        int secondValue = input.nextInt();

        if(secondValue % firstValue == 0){
            System.out.printf("%d is a multiple of %d%n", firstValue, secondValue);

        }else
            System.out.printf("%d is not a multiple of %d%n", firstValue, secondValue);
    }
}
