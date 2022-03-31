package Udemy;

public class Method {
    //It is nothing but block of Statements
//Types of Variable 1. instance/Global v 2. Local 3. Class variable.
    /*
    1. Instance v -- Anything declared inside the class.
    2. Local V --- Anything declared inside method body.
    3. Class C ---
     */
// Void is for data type in this method will not return anything, if Int is used then return type should be int only
    public static void main(String[] args) {
        Method obj = new Method();

        obj.checkReturnType();
        System.out.println(obj.checkReturnType());
        System.out.println("-----------");

        int i = obj.display(5, 10);
        System.out.println("The value is " + i);
    }

    public int display(int k, int sk) {
        int sum = k + sk;
        return sum;
    }

    public String checkReturnType() {
        String s = "This is to check the return type";
        return s;
    }

}
