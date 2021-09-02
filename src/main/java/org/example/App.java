/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanny = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanny.nextLine();
        String output = "Hello, "+name+", nice to meet you";
        System.out.println(output);
    }
}
