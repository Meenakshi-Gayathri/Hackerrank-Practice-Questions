import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            
        double amount = 12324.134;

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usCurrency = usFormat.format(amount);
        System.out.println("US: " + usCurrency);
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indianCurrency = indiaFormat.format(amount);
        System.out.println("India: " + indianCurrency);

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chineseCurrency = chinaFormat.format(amount);
        System.out.println("China: " + chineseCurrency);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String frenchCurrency = franceFormat.format(amount);
        System.out.println("France: " + frenchCurrency);
    }
}

        
    

