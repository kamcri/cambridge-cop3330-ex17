/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double legalBAC = 0.08;

        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        int gender = sc.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        int ounces = sc.nextInt();
        System.out.println("What is your weight, in pounds?");
        int weight = sc.nextInt();
        System.out.println("How many hours has it been since your last drink?");
        int lastDrink = sc.nextInt();

        if(gender == 1)
        {
            double BAC = ((ounces * 5.14) / weight * 0.73) - 0.015 * lastDrink;
            System.out.printf("Your BAC is %.6f\n", BAC);

            String isLegal;
            isLegal = (BAC >= legalBAC) ? "It is not legal for you to drive." : "It is legal for you to drive.";
            System.out.println(isLegal);
        }
        if(gender == 2)
        {
            double BAC = ((ounces * 5.14) / weight * 0.66) - 0.15 * lastDrink;
            System.out.printf("Your BAC is %.6f\n", BAC);

            String isLegal;
            isLegal = (BAC >= legalBAC) ? "It is not legal for you to drive." : "It is legal for you to drive.";
            System.out.println(isLegal);
        }
    }
}
