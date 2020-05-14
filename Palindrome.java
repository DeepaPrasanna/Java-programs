import java.io.*;

public class Palindrome {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int num, temp, d, rev = 0;
        System.out.println("Enter a number to check if it's palindrome or not");
        num = Integer.parseInt(in.readLine());
        temp = num;
        while (temp != 0) {
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;

        }
        if (rev == num) {
            System.out.println("The " + num + " is a palindrome number");
        } else {
            System.out.println("The " + num + " is not a palindrome number");

        }

    }

}