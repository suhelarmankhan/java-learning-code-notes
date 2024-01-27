package com.mycompany.bebinnerjava;

public class Decimal_To_Binary_octal_hexadecimal_96 {

    public static void main(String[] args) {

        //convert decimal into binary,octal,hexadecimal numhber
        //decimal to binary
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

        //decimal to octal
        decimal = 20;
        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);

        //decimal to hexadecimal 
        decimal = 15;
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(hexadecimal);

    }
}
