package com.company;

public class testArray {
    public static void main(String[] args) {
        testArray obj = new testArray();
        obj.test1();
      //  obj.test2();
       // int a[] = {33, 3, 4, 5};
       // min(a);


    }

    public void test1() {
        double[] myList = {1, 5, 5, 5, 5, 1};
        double Max = myList[2];
        int indexOfMax = 0;
        System.out.println(myList.length);

        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > Max) {
                Max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
    }

    public void test2() {
        int[] b;//Declare
        b = new int[] {1, 2, 3};//initialize

        String xy[] = {"yuv", "raj"};
        for (int i = 0; i < b.length; i++) {
            System.out.println(xy[i]);
        }

    }

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                System.out.println(min);
            }
        }
    }
}
