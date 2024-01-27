
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class FibonacciSeries_54 {
    public static void main(String[] args) {
        
        
        
       Scanner input = new Scanner(System.in); 
       
        System.out.print("How many numbers: ");
        int n = input.nextInt();
        
        
      int first = 0;
      int second = 1;
      int fibonacci;
        
        System.out.print(first+ " "+ second);
        for (int i = 3; i <=n; i++) {
            
            fibonacci = first + second;
            System.out.print(" "+fibonacci);
            
            first = second;
            second = fibonacci;
            
        }
        
        
        
        
        
    }
    
}
