package com.company;
class THEM{
    public THEM(){
        System.out.println("Hi im them");
    }
}
class Animal extends THEM{
    public Animal(){
        System.out.println("They bite");
    }

}
class Dog extends Animal{
   public Dog(){
       System.out.println("woof woof");
   }
    public void Dogs(){

        System.out.println("They bark");
    }
}
public class Pet {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.Dogs();
    }
}
