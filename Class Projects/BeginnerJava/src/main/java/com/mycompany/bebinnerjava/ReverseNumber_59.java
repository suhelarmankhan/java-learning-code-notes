
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class ReverseNumber_59 {
    public static void main (String [] args){
        
        Scanner input = new Scanner (System.in);
        
        int num, sum =0,temp,remainder;
        
        System.out.print("Enter any number: ");
        num = input.nextInt();
        
        temp = num;
        
    while(temp!=0){
        remainder = temp %10;
        sum = sum*10 + remainder;
        temp = temp/10;
        
        
    }
        System.out.println("Reverse = "+sum);
    }
}
