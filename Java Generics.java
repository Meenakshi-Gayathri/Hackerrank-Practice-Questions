import java.io.*;
import java.util.*;

public class JavaGenerics {
    private static <T> void printArray(T[] array) {
        for(T a: array)
            System.out.println(a);
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3});
        printArray(new String[]{"Hello", "World"});
    }
}
