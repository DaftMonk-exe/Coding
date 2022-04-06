package com.company;

import java.util.Scanner;

public class Maxim {
    int a,b,c,ans=0;
    public static void max(Maxim r)
    {
        int maxi=r.a;
        if(r.b>maxi) {
            maxi=r.b;
        }
        if(r.c>maxi) maxi = r.c;
        r.ans=maxi;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Maxim X = new Maxim();
        X.a=in.nextInt();
        X.b=in.nextInt();
        X.c=in.nextInt();
        max(X);
        System.out.println(" "+ X.ans);
    }
}
