import java.io.*;

public class PerfectNo {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int num, i, sum = 0;
        System.out.println("Enter a number to check if it's perfect no.");
        num = Integer.parseInt(in.readLine());

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("The " + num + " is a perfect number.");

        } else {
            System.out.println("The " + num + " is not a perfect number.");

        }
    }

}