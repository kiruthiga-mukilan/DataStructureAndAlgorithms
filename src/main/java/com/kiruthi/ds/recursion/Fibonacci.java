package com.kiruthi.ds.recursion;


public class Fibonacci {

    static int s= 0;

    static int fib(int n)
    {
        if (n <= 1)
            return n;

        System.out.println(s=fib(n-1) + fib(n-2));
        return s;
    }

    public static void main (String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}
