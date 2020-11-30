package com.exercise.chapterTwo;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer value");
        int number = input.nextInt();
        if (number%2 == 0){
            System.out.println("The Input is Even");
        }else
            System.out.println("The Input is odd");
    }
}
