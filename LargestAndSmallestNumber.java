
package com.exercise.chapterTwo;
import java.util.Scanner;

public class LargestAndSmallestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value");
        int minAndMaxValue = input.nextInt();
        System.out.println("Enter second value");
        int second = input.nextInt();
        System.out.println("Enter third value");
        int third = input.nextInt();
        System.out.println("Enter fourth value");
        int fourth = input.nextInt();
        System.out.println("Enter fifth value");
        int fifth = input.nextInt();
        if (second <= minAndMaxValue) {
            minAndMaxValue = second;
        }
        if (third <= minAndMaxValue) {
            minAndMaxValue = third;
        }
        if (fourth <= minAndMaxValue) {
            minAndMaxValue = fourth;
        }
        if (fifth <= minAndMaxValue) {
            minAndMaxValue = fifth;
        }System.out.printf("%d%n", minAndMaxValue);
        if (second >= minAndMaxValue) {
            minAndMaxValue = second;
        }
        if (third >= minAndMaxValue) {
            minAndMaxValue = third;
        }
        if (fourth >= minAndMaxValue) {
            minAndMaxValue = fourth;
        }
        if (fifth >= minAndMaxValue) {
            minAndMaxValue = fifth;
        }System.out.printf("%d%n", minAndMaxValue);
    }
}





