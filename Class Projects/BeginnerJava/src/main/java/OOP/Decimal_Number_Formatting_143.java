
package OOP;

import java.text.DecimalFormat;

public class Decimal_Number_Formatting_143 {
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.00");
        
        double x = 2.3535353;
       // System.out.printf("x = %.2f",x);-- C language
        System.out.println("x = "+ob.format(x));
        
    }
}
