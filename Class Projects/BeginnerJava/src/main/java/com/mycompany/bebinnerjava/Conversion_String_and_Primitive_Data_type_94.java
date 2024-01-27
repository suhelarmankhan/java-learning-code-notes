package com.mycompany.bebinnerjava;

public class Conversion_String_and_Primitive_Data_type_94 {
    public static void main(String[] args) {
        
        int i = 100;
        String s = Integer.toString(i);
        System.out.println(s);
        
        double d = 10.3;
        String s2= Double.toString(d);
        System.out.println(s2);
        
        
        boolean b = true;
        String s3 = Boolean.toString(b);
        System.out.println(s3);
        
        String s4 ="32";
        double d2 = Double.parseDouble(s4);
        System.out.println(d2);
        
        int it = Integer.valueOf(s4);
        System.out.println(it);
        
    }
}
