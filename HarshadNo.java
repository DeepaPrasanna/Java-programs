import java.io.*;

public class HarshadNo {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int num, temp, sum = 0, d;
        System.out.println("Enter a no. to check if it's Harshad no. or not");
        num = Integer.parseInt(in.readLine());
        temp = num;
        while (temp != 0) {
            d = temp % 10;
            sum = sum + d;
            temp = temp / 10;
        }
        if (num % sum == 0) {
            System.out.println("The " + num + " is Harshad number");
        } else {
            System.out.println("The " + num + " is not a Harshad number");

        }
    }
}