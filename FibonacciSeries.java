public class FibonacciSeries {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0, n = 1;
        System.out.print(a + ",");
        System.out.print(b + ",");
        do {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ",");
            n++;
        } while (n <= 10);

    }
}