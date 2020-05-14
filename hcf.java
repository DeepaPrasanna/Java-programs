// finding the H.C.F of two numbers

import java.io.*;

class hcf {
    public static void main(String args[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int num1, num2, product, i, hcf = 0;
        System.out.println("Enter two numbers");
        num1 = Integer.parseInt(in.readLine());
        num2 = Integer.parseInt(in.readLine());
        product = num1 * num2;
        for (i = 1; i <= product; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                hcf = i;
            }
        }
        System.out.println("The H.C.F of " + num1 + " and " + num2 + " is " + hcf);

    }
}