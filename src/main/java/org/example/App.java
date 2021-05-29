package org.example;

/**
 *
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name =  myObj.nextLine();
        System.out.println("Hello, " + name + " nice to meet you!");
    }
}
