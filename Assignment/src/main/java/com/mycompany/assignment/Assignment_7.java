
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_7 {
    public static void main (String [] args){
    
        Scanner input  = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Do you love java? ");
        ch = input.next().charAt(0);
        
        if( ch == 'y' || ch == 'Y'){
            System.out.println("your are a java lover");
        }else{
            System.out.println("you are not a java lover");
        }
    }
    
    
}
