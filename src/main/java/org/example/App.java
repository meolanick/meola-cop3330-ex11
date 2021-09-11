/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double euros;
        double exchangeRate;
        double dollars;

        System.out.println("How many euros are you exchanging?");
        euros = scan.nextDouble();

        System.out.println("What is the exchange rate?");
        exchangeRate = scan.nextDouble();

        dollars = (euros * exchangeRate );

        System.out.println( euros + " euros at an exchange rate of " + exchangeRate + " is");
        System.out.printf( " %.2f U.S. dollars", dollars );
    }
}
