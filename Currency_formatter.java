/*Given a double-precision number,'payment' , denoting an amount of money, use the NumberFormat class' 
getCurrencyInstance method to convert 'payment' into the US, Indian, Chinese, and French currency formats. 
Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where 'formatted payment' is 'payment' formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
Input Format:

A single double-precision number denoting 'payment'.

Constraints:
0 <= payment <= 10^9

Output Format:

On the first line, print US: u where  is  formatted for US currency.
On the second line, print India: i where  is  formatted for Indian currency.
On the third line, print China: c where  is  formatted for Chinese currency.
On the fourth line, print France: f, where  is  formatted for French currency.*/

import java.util.*;
import java.text.*;

public class Currency_formatter {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        // NumberFormat nf = NumberFormat.getNumberInstance();
        // nf.setMaximumFractionDigits(2);
        // nf.setMaximumFractionDigits(2);
        
        // String s1 = nf.format(payment);
        scanner.close();
        
        // Write your code here.
        @SuppressWarnings("deprecation")
        Locale iLocale = new Locale("en", "IN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(iLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
