
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class ConditionalOperator_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int num1,num2,large;
        
        System.out.print("Enter 2 number: ");
        num1 = input.nextInt();
        num2= input.nextInt();
        
        large = (num1>num2)? num1 : num2;
        
        System.out.println("Large number: "+ large);
        
        
        
    }
    
}
