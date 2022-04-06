package com.company;

class Bank{
    static int balance;
    Bank(){
        balance = 4000;
    }
    public synchronized void with(int val){
        if(val<=balance){
            System.out.println(val+" withdrawn");
        balance-=val;
    }
    else{
            System.out.println("Insufficient");
        }
}}
class Thread10 extends Thread{
    Bank B1;
    Thread10(Bank B1){
        this.B1=B1;
    }
    public void run(){
        B1.with(3000);
    }
}
public class Human{
    public static void main(String[] args) {
Bank B2 = new Bank();
Thread10 T1=new Thread10(B2);
        Thread10 T2=new Thread10(B2);
        Thread10 T3=new Thread10(B2);
        T1.start();
        T2.start();
        T3.start();
    }
}