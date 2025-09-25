package com.pluralsight;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Alice";
        int age = 25;
        double gpa = 3.6789;
        String message1 = String.format("Name: is %s", name);
        String message2 = String.format("Age: %d", age);
        String message3 = String.format("gpa: %f", gpa);
        System.out.println (message1);
        System.out.println (message2);
        System.out.println (message3);
        System.out.printf("Her name is %s, she is %d, and her gpa is %f", name, age, gpa);




    }


}
