package Udemy;

/*
While loop -  When number of iteration is unknown.
Do while loop - when loop should execute at lease once irrespective of condition.
For loop -  NUmber of iteration are knows.
 */
public class switchCase {
    public static void main(String[] args) {
        switchCase obj = new switchCase();
        //obj.$Test_9();
        //  obj.test2();
        // obj.test3();
        obj.test5();
    }

    public void $Test_9() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("No case found");
        }
    }

    public void test2() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void test3() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public void test4() {
        int i = 0;
        int count = 0;
        while (i < 3) {
            for (int j = 0; j < 4; j++) {
                int k = 0;
                do {
                    System.out.println("I---> " + i + " J---> " + j + " K--->" + k);
                    k++;
                    count++;
                } while (k < 5);
            }
            i++;
        }
        System.out.println(count);
    }

    public void test5() {
        for (int i = 1; i < 11; i++) {
            if (i >= 5 && i <= 7)
                continue;
            System.out.println(i);
        }
    }
}
