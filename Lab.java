package com.company;

import java.util.Scanner;

public class Lab {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        String name ;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        try {
            int c = a / b ;

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try{
        if(!(name.equals("TOUTR"))){
            throw new Myexception("Not OuTr");} }
        catch (Myexception | ArithmeticException e){
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("bitchss nigga");
        }

    }
    public static int divide(int a,int b){
        if(b==0)
            throw new ArithmeticException("Divide by zero");
        return a/b;
    }
}
