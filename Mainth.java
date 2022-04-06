package com.company;
class Thread1 extends Thread{
    public Thread1(String name){
        super(name);
    }
    public int tr=0;
    @Override
    public void run(){
        for(;tr<5;tr++)
        System.out.println("Hi im running"+this.getState());
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
class Thread2 extends Thread{
   public Thread2(String name){
       super(name);
   }
    public int tr2=0;
    @Override
    public void run(){
        for(;tr2<3;tr2++)
        System.out.println("bitchass nigga now runnning "+ this.getName()+this.getState());
    }
}
public class Mainth{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("harambe");
        Thread2 t2 = new Thread2("harami be");

//        t2.setPriority(1);
        t2.start();
//        try{
//            t2.join();
//        }
//        catch(InterruptedException e){
//            e.getStackTrace();
//        }
//        for(int i=0;i<5;i++){
//            System.out.println("whaddup nigga");
//        }
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//       }

//        t2.start();
    }
}