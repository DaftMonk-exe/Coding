package com.company;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class SecondSmall {
    public static void main(String[] args) {
        int[] arr= new int[5];
        int i ;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(i=0;i<5;i++){
            for(int j =0;j<(5-i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int a :arr) System.out.println(a);
        System.out.println("sceondd smallest = "+ arr[1]);
        System.out.println("second largest = "+arr[3]);
    }
}
