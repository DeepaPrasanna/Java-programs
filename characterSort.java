
/* Wap to accept a sentance...in that sentance sort all the vowels in ascending order.. 
Ex:
Input : 
Hi good morning
Output:
Hi giod mornong

Input 2:
i am eating a apple

Output:
a am aateng e ippli
*/
import java.util.Scanner;

public class characterSort {
    public static void main(String args[]) {
        String str = "", str1 = "", str2 = "", temp = "";
        char ch;
        int len, i, j;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();
        sc.close();

        len = str.length();
        // extracting the vowels first
        for (i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                str1 += ch;

            }
        }
        // sorting the vowels
        for (i = 65; i <= 95; i++) {

            for (j = 0; j < str1.length(); j++) {
                ch = str1.charAt(j);
                if (ch == (char) i || ch == (char) (i + 32)) {
                    str2 += ch;
                }
            }
        }
        // replacing the sorted vowels in the original string
        j = 0;
        for (i = 0; i < len; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                temp += str2.charAt(j);
                j++;

            } else {
                temp += ch;
            }
        }

        // System.out.println(str);

        // System.out.println(str1);
        // System.out.println(str2);
        System.out.println(temp);

    }

}