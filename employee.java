package com.company;
class Employer {
    private int id;
    private String cname;

    public void seetem(int id1, String name) {id = id1;
       cname = name;
    }

    public String getname() {
        return cname;

    }
    public int getid(){
        return id;
    }
}

public class employee{
        public static void main(String[] args) {
        Employer ee = new Employer();
        ee.seetem(21,"fling");
            System.out.println(ee.getname()+ " "+ee.getid()+" "+(ee instanceof Employer));
    }
}
