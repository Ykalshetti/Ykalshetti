package com.company;

public class Animal {

    static int i = 10; //instance variable

    public static void main(String[] args) {
        // int i; //Declaration
        // i = 25; //Assignment
        // int  i = 15; // Initialization (Local variable)

       // System.out.println(i);
        Animal obj = new Animal();
        obj.method1();

    }

    public void method1() {
        int[] b;//Declare
        b = new int[] {1, 2, 3};//initialize

        int[] a = new int[5];

        System.out.println(a);
        //System.out.println(b);

    }
}
