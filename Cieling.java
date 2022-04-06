package com.company;

public class Cieling {
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,6,12,29,34,56,78};
        int target=33;
        System.out.println(binary(arr,target));

    }
    static int binary(int[] arr,int target){
        int mid;
        int min = 0;
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]){
        while(start<=end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return arr[mid];
            else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            min = arr[start];
            for (int i = start; i <= end; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }

        }
        }
        else{
            while(start<=end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target)
                    return arr[mid];
                else if (arr[mid] > target) {
                    start=mid+1;
                } else if (arr[mid] < target) {
                    end=mid-1;
                }
                min = arr[end];
                for (int i = end; i >=start; i--) {
                    if (arr[i] < min)
                        min = arr[i];
                }

            }

        }
        return min;
    }
}
