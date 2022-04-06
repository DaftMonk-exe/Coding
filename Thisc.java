package com.company;

public class Thisc {
    int health,boost;
    public Thisc(){
        health = 50;
        boost = 50;
    }
    public Thisc(int health,int boost){
        this.health=health;this.boost=boost;
    }

    public static void main(String[] args) {
        Thisc man = new Thisc();
        Thisc man2 = new Thisc(100,69);
        System.out.println(man.health+" "+man.boost);
        System.out.println(man2.health+" "+man2.boost);
    }
}

