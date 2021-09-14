/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Persad
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name =  myObj.nextLine();
        //Output
        String output = ("Hello, " + name + " nice to meet you!");
        System.out.println(output);

    }
}
