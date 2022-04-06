package com.company;
class Thread3 extends Thread{
    public Thread3(String name){
        super(name);
    }
    public int tr=0;
    @Override
    public void run(){
        for(;tr<50;tr++)
            System.out.println("Hi im running"+this.getName());
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
    class Thread4 extends Thread{
        public Thread4(String name){
            super(name);
        }
        public int tr2=0;
        @Override
        public void run(){
            for(;tr2<30;tr2++)
                System.out.println("bitchass nigga now runnning "+ this.getName()+this.getState());
        }
    }
    public class MainTH2{
        public static void main(String[] args) {
            com.company.Thread3 t1 = new com.company.Thread3("harambe");
            com.company.Thread3 t2 = new com.company.Thread3("harami be");

            t2.start();
            t1.setPriority(Thread.MAX_PRIORITY);
   try{
       t2.join();
   }
   catch (InterruptedException e){
       e.getStackTrace();
   }
    t1.start();

//
    }
}
