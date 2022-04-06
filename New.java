package com.company;

public class New {

 public static void Mew(){
System.out.println("First method");
    }
    public static void Mew(int a){
    System.out.println("Now inside second method "+a);
    }
    public static void main(String[] args) {
        New n = new New();
        New m = new New();
        n.Mew();
        m.Mew(9);
        System.out.println("All run");
    }
}
