package com.company;

public class pascal
{
    static int i,j,n;
    static
    {
        n=5;
    }
    {
        for(int line = 1; line <= n; line++)
        {

            int C=1;
            for(int i = 1; i <= line; i++)
            {
                System.out.print(C+" ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pascal t=new pascal();
    }
}