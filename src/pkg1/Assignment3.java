package pkg1;

import com.company.Assignment;

public class Assignment3 extends Assignment {

    static Assignment3 a3 = new Assignment3();

    public static void main(String[] args) {
        int x = 10;
        int y = 12;

        if (x + y < 10) {
            System.out.println("x+y is less than 10");
        }
        else {
            System.out.println("x+y is greater than 20");
        }

        /* System.out.println(a3.x); */
    }

}
