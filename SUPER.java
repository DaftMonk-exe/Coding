package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import javax.accessibility.AccessibleBundle;

class Subsuper{
    static int j=5,k=6,l=7;
    Subsuper(){
        System.out.println("HI HELLO");
    }
    public void printo(){
        System.out.println("Hello from printo");
    }
    Subsuper(int a,int b, int c){
        j++;
        k++;
        l++;
        System.out.println(j+" "+k+" "+l);
    }
}
public class SUPER extends Subsuper {
    SUPER(){
//        super();
        super(12,14,15);
        System.out.println("hello from super");
    }
    public void prints(){
        super.printo();
        System.out.println("prints from super");
    }

    public static void main(String[] args) {
        SUPER sup = new SUPER();
        sup.prints();
        SUPER sup1 = new SUPER();
        sup1.prints();
    }
}
