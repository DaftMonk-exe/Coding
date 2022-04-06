package com.company;

public class string {
    public static void main(String[] args) {
        String name = greeet("kunal");
        System.out.println(name);
    }
     static String greeet(String name) {
        String message= "HEloo "+name;
        return message;
     }
    }