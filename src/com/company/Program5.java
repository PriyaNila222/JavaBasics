package com.company;

//Define local variables and global variables

public class Program5 {
    int variable = 1;

    public static void main(String[] args) {
        int variable = 2;
        System.out.println("Global variable = " + variable);
        System.out.println("Local variable = " + variable);
    }
}