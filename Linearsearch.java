package com.company;

public class Linearsearch {
        public static void main(String[] args) {
            int[] arr = new int[]{1, 3, 5, 22, 33, 4, 67, 8};
            int target=8;
            int ans = lsearch(arr,target);
            System.out.println(ans);
        }
        static int lsearch(int[] arr,int tar){
            if(arr.length<1){
                return 0;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==tar){
                    return i;
                }
            }
            return -1;
        }
    }

