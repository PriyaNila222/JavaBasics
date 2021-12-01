package com.company;

//Write a function to print your name and call the function from main method

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        name();
    }

    public static void name () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name = " );
        String  myName = scanner.nextLine();
        System.out.println("My name is: " + myName);
    }
}
