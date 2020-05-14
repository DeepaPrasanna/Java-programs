import java.io.*;

public class ArmstrongNo {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int num, temp, sum = 0, d;
        System.out.println("Enter a number to check if it's a armstrong or not");
        num = Integer.parseInt(in.readLine());
        temp = num;
        while (temp > 0) {
            d = temp % 10;
            sum = sum + (d * d * d);
            temp = temp / 10;

        }
        if (sum == num) {
            System.out.println("The " + num + " is a Armstrong number");
        } else {
            System.out.println("The " + num + " is not a Armstrong number");

        }
    }

}