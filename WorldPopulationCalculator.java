package com.exercise.chapterTwo;



public class WorldPopulationCalculator {

    public static void main(String[] args) {
        // Assume the current world population is 7,800,000,000
        // and the rate of growth is 1.05% every year

        double population = 7_800_000_000.00;
        double growthRate = 1.05/100;
        double increment;
        System.out.printf("The World's current population is %.2f%n", population);
        increment = population * growthRate;
        population = population + increment;
        System.out.printf("The World's population next year would be %.2f%n", population);
        increment = population * growthRate;
        population = population + increment;
        System.out.printf("The World's population next two year would be %.2f%n", population);
        increment = population * growthRate;
        population = population + increment;
        System.out.printf("The World's population next three year would be %.2f%n", population);
        increment = population * growthRate;
        population = population + increment;
        System.out.printf("The World's population next four year would be %.2f%n", population);
        increment = population * growthRate;
        population = population + increment;
        System.out.printf("The World's population next five year would be %.2f%n", population);
    }
}
