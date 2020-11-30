package com.exercise.chapterTwo;

import java.util.Scanner;

public class NegativePositiveZeroInputs {
    private static int zeroInputs;
    private static int positiveInputs;
    private static int negativeInputs;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: (any positive or negative integers or enter zero)");
        int first = input.nextInt();
        System.out.println("Enter second value: (any positive or negative integers or enter zero)");
        int second = input.nextInt();
        System.out.println("Enter third value: (any positive or negative integers or enter zero)");
        int third = input.nextInt();
        System.out.println("Enter fourth value: (any positive or negative integers or enter zero)");
        int fourth = input.nextInt();
        System.out.println("Enter Last value: (any positive or negative integers or enter zero)");
        int last = input.nextInt();
        if (first == 0){
            zeroInputs++;
        }else{
            if (first >= 0){
                positiveInputs++;
            }else{
                if (first <= 0){
                    negativeInputs++;
                }
            }
        }
        if (second == 0){
            zeroInputs++;
        }else{
            if (second >= 0){
                positiveInputs++;
            }else{
                if (second <= 0){
                    negativeInputs++;
                }
            }
        }
        if (third == 0){
            zeroInputs++;
        }else{
            if (third >= 0){
                positiveInputs++;
            }else{
                if (third <= 0){
                    negativeInputs++;
                }
            }
        }
        if (fourth == 0){
            zeroInputs++;
        }else{
            if (fourth >= 0){
                positiveInputs++;
            }else{
                if (fourth <= 0){
                    negativeInputs++;
                }
            }
        }
        if (last == 0){
            zeroInputs++;
        }else{
            if (last >= 0){
                positiveInputs++;
            }else{
                if (last <= 0){
                    negativeInputs++;
                }
            }
        }System.out.printf("Number of negative input is: %d%n", negativeInputs);
        System.out.printf("Number of positive input is: %d%n", positiveInputs);
        System.out.printf("Number of zero input is: %d%n", zeroInputs);
    }
}
