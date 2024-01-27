
package com.mycompany.bebinnerjava;
//convert binary, octal, hexadecimal number into decimal
public class Binary_Octal_Hexadecimal_to_Decimal_95 {
    public static void main(String[] args) {
        
        
           String binary = "101011";

           Integer decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);
   
        
        String octal = "675";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println(decimal2);
        
        
        String hexadecimal = "F";
        Integer decimal3 = Integer.parseInt(hexadecimal,16);
        System.out.println(decimal3);
        
    }
  
}
