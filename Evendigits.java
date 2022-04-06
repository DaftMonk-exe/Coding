package com.company;

public class Evendigits {
    public static void main(String[] args) {
        int[] arr=new int[]{12,12,46,678,99999};
        System.out.println(evendigi(arr));
    }
    static int evendigi(int[] num){
        int ctr=0;
        for(int i=0;i<num.length;i++){
            int coutr=0;
            while(num[i]>0){
                coutr++;
                num[i]=num[i]/10;
            }
            if(coutr%2==0)
                ctr++;
        }
        return ctr;
    }
}
