package Udemy;

public class calculator {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println("THe result is ");
        System.out.println(cal.add(5, 5));
        System.out.println(cal.sub(5, 5));
        System.out.println(cal.mul(5, 5));
        System.out.println(cal.div(5, 5));
    }

    public int add(int a, int b) {
        int add = a + b;
        return add;
    }

    public int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public int div(int a, int b) {
        int div = a / b;
        return div;
    }
}
