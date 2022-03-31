package Udemy;

public class randomNumber {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 5);
        System.out.println(num);
        randomNumber rm = new randomNumber();
        rm.go();
        rm.go1();
        rm.go2();
    }

    public void go() {
        System.out.println("Inside Go method");
    }

    public void go1() {
        System.out.println("Inside Go1 method");
    }

    public void go2() {
        System.out.println("Inside Go2 method");
    }
}
