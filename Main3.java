package com.company;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        String name = "123 4";
        Allexceep c = null;
        Allexceep c1 = new Allexceep();
        for (int i = 0; i < arr.length; i++){
            if((name.charAt(i))==' '){
                continue;
            }

            arr[i] = Character.getNumericValue(name.charAt(i));}
//}  try {
//            int a = 10;
//            int b = 0;
//            int c3 = a / b;
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
//        try{
//            int d = Integer.parseInt(name);
//
//        }
//        catch (NumberFormatException e){
//            System.out.println(e.getMessage());
//        }
//        try{
//            System.out.println(arr[10]);
//
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        try{
//            c.greet();
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        try{
//            c1.method();
//        }
////        catch (NoSuchMethodException e){
////            System.out.println(e.getMessage());
////        }
//        finally {
//            System.out.println("hallelujah");
//        }
//
//    }
        System.out.println(Arrays.toString(arr));

    }
}
