import java.io.*;
import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine().toLowerCase();
        String str2 = s.nextLine().toLowerCase();

        if (str1.length() == str2.length()) {
            char[] ca1 = str1.toCharArray();
            char[] ca2 = str2.toCharArray();

            Arrays.sort(ca1);
            Arrays.sort(ca2);

            boolean result = Arrays.equals(ca1, ca2);

            if (result) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
