package com.company;
import java.util.*;
public class Sum {
    static int Sumn(int n){
        int add=0;
        if(n==0) {
            return 0;
        } else {
            add = n + Sumn(n-1);
        }
            return add;

    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        System.out.println(" the sumo f natural numers till n is "+ Sumn(n));
    }



}
