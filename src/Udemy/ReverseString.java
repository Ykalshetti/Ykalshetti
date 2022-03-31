package Udemy;
import javax.sql.rowset.serial.SQLOutputImpl;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString input = new ReverseString();
        input.reverse();
    }
    public void reverse() {
        Scanner in = new Scanner(System.in);
        String original, reverse = null;
        System.out.println("Enter the String to reverse: ");
        original = in.nextLine();

        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(original);

        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        System.out.println(input1);
    }
}
