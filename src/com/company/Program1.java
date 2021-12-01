package com.company;

//How to create a class, object, method and its signature

public class Program1 {

    public static void main(String[] args) {
        Program1 object = new Program1();
        int additionValue = object.add(3,4);
        System.out.println("Addition value is: " + additionValue);
    }

    int add(int value1, int value2) {
        return (value1 + value2);
    }
}
