package com.company;

public class Assignment {
    protected int x = 45;
    public int a = 40;
    int c = 10;
    private int y = 18;

    public static void main(String[] args) {
        Assignment obj = new Assignment();
       // obj.method1();
       // obj.Method2();
       // obj.method3();
        obj.method4();
    }

    public void method1() {
        int count = 1;
        while (count <= 3) {
            System.out.println(count % 2 == 1 ? "***" : "+++++");
            ++count;
        }
    }

    public void Method2() {
        char chars[] = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);
        System.out.println("The value of Y is" + " " + y);
    }

    public void method3() {
        float a = 35 / 5;
        System.out.println(a);
    }
    public void method4(){
        final int lower = 1;
        final int higher = 10;
        int sum = 0;
        int number = lower;
        while (number<= higher){
            sum = sum + higher;
            number++;
        }
        System.out.println("The sum from"+" "+lower+" to "+higher+ " is =" +sum );
    }
}

class Assignment2 {
    public static void main(String[] args) {
        Assignment2 obj2 = new Assignment2();
        Assignment obj23 = new Assignment();
        obj2.me1();
        //obj23.method1();
        //obj23.Method2();
        //obj23.method3();

    }

    public void me1() {
        Assignment obj23 = new Assignment();
        System.out.println(obj23.x);
        System.out.println(obj23.a);
        System.out.println(obj23.c);
    }
}
