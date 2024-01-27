
package com.mycompany.bebinnerjava;

public class MathClass_36 {
    public static void main(String[] args) {
        
        int x = 20;
        int y = -10;
        
        //max
        int max =Math.max(x, y);
        System.out.println("Meximum: "+max);
      
        //min
         int min =Math.min(x, y);
        System.out.println("Minimum: "+min);
      
        //abs
        int absolute = Math.abs(y);
        System.out.println("Absolute of y = "+absolute);
        
        
        //pow
       x =2;
       y = 4;
       double power = Math.pow(x, y);
        System.out.println(power);
        
       //round 
      int round =  Math.round(8.2f);
        System.out.println("Round of 8.8 = "+round); 
        
        double pi = Math.PI;
        System.out.println("Pi value: "+ pi);
        
    }
}
