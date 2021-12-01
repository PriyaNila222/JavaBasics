package com.company;

// Write a program to print your name

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your firstname: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your lastname: ");
        String lastName = scanner.nextLine();
        System.out.println("Your name is: " + firstName + " " + lastName );
    }
}
