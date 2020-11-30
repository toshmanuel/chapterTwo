package com.exercise.chapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    double height;
    double weight;
    double bmi;

    public BodyMassIndex(double height, double weight){
        this.weight = weight;
        this.height = height;
    }

    public void setHeight(double height){
        boolean heightIsValid = height > 0;
        if (heightIsValid) {
            this.height = height;
        }else {
            System.out.println("Wrong input");
        }
    }
    public void setWeight(double weight){
        boolean weightIsValid = weight > 0;
        if (weightIsValid){
            this.weight = weight;
        }else {
            System.out.println("Wrong Input");
        }
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }
    public double calculateBMI(){
        bmi = (weight/(height * height));
        if(bmi < 18.5){
            System.out.printf("%s%n", "Underweight");
        }
        if(bmi >= 18.5 && bmi <= 24.9){
            System.out.printf("%s%n", "Normal");
        }
        if(bmi >= 25 && bmi <= 29.9){
            System.out.printf("%s%n", "Overweight");
        }
        if(bmi >= 30){
            System.out.printf("%s%n", "Obese");
        }
        return bmi;
    }
    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height in metres(m)");
        bmi.setHeight(input.nextDouble());
        System.out.println("Enter weight in Kilogram(Kg)");
        bmi.setWeight(input.nextDouble());

        System.out.println(bmi.calculateBMI());
    }
}
