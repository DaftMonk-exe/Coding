package com.company;
class THEM1{
    public THEM1(){
        System.out.println("Hi im them");
    }
}
class Animal1 extends THEM{
    public Animal1(){
        System.out.println("They bite");
    }
    public void Dogs(){
        System.out.println("Hi im the animal dog");
    }

}
class Dog1 extends Animal1{
    public Dog1(){
        System.out.println("woof woof");
    }
    public void Dogs(){

        System.out.println("They bark");
    }
}

public class Helllo {
    public static void main(String[] args) {
        Animal1 a =new Animal1();
        a.Dogs();
        Dog1 d = new Dog1();
        d.Dogs();
    }
}
