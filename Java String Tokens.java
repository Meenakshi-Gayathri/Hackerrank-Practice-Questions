import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String regex = "[\\s,!?._'@]+";
        String arr[] = s.split(regex);
        int count = 0;
        for (String word : arr) {
            if (!word.isEmpty()) {
                count++;
            }
        }        
        System.out.println(count);        
        for (String word : arr) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
        in.close();
    }
}
