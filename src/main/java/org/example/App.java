/*
 *  UCF COP3330 Fall 2021 Assignment 1.17 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    static final double MEN_ADR = 0.73;
    static final double WOMEN_ADR = 0.66;
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: "); //Asking for user input
        int gender = x.nextInt(); //Storing user input
        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = x.nextInt(); //Storing user input
        System.out.print("What is your weight, in pounds? ");
        int weight = x.nextInt(); //Storing user input
        System.out.print("How many hours has it been since your last drink? ");
        int hours = x.nextInt(); //Storing user input

        double ADR = 0;
        if(gender == 1){ //Determining gender
            ADR = MEN_ADR;
        }
        else {
            ADR = WOMEN_ADR;
        }

        double BAC = (ounces * 5.14 / weight * ADR) - 0.015 * hours; //Formula for BAC
        System.out.printf("Your BAC is %f\n", BAC);
        String out = (BAC < 0.08) ? "It is legal for you to drive." : "It is not legal for you to drive.";
        System.out.println(out);
    }
}