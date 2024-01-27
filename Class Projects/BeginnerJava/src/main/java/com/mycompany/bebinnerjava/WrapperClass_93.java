
package com.mycompany.bebinnerjava;

public class WrapperClass_93 {
    public static void main(String[] args) {
        
        
        //Primitive -> object
       int x =30;
       Integer y = Integer.valueOf(x);
        System.out.println("Y = "+y);
        
       Integer z = x;//Integer.valueOf (x) autoboxing
        System.out.println("Z = "+z);
        
        
        //object -> primite 
        Double d = new Double (10.25);
        System.out.println("d = "+d);
        
        
      double e = d;//double e = d.doubleValue();
        System.out.println("e = "+e);
        
        
    }
  
}
