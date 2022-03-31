package Udemy;

import org.openqa.selenium.Alert;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        array ar = new array();
        ar.test3();

    }

    public void test1() {
        {
            double[] myList = {1, 5, 5, 5, 5, 1};
            double Max = myList[1];
            int indexOfMax = 0;
            System.out.println("Length of Array is: " + myList.length);
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > Max) {
                    Max = myList[i];
                    indexOfMax = i;
                }
            }
            System.out.println("Index Of Max: " + indexOfMax);
        }

    }

    public void tes2() {
       int myArray[][]  = new int[2][3];
       String [] Raj1 = {"ral9","ramesh","Rahim"};
       for (int i = 0; i>=Raj1.length; i++)
        System.out.println(Raj1);
    }
    public void test3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverase: ");
        int num = sc.nextInt();

        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Revese num is: " + rev);

    }
}
