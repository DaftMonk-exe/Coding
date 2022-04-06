package com.company;
class Parent{
    public void disp(){
        System.out.println("Im parent");
    }

}
class Child extends Parent{
    public void disp(){
        System.out.println("Im child");
    }
}
public class Meth {
    public static void main(String[] args) {
        Parent P = new Parent();
        P.disp();
        Child c = new Child();
        c.disp();
        Parent P1 = new Child();
        P1.disp();
        P = c;
        P.disp();
    }
}
