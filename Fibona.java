package com.company;

import java.util.Scanner;

public class Fibona {
    static int fibo(int n){
        if(n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        int n,i;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        for(i=0;i<n;i++){
            System.out.print(" "+fibo(i)+" ,");
        }

    }
}
