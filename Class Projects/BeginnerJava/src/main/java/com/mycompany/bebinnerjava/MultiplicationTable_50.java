
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class MultiplicationTable_50 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         int m,n;
       
         System.out.print("Enter initital number: ");
         m = input.nextInt();
         
         System.out.print("Enter final number: ");
         n = input.nextInt();
         
         
         
         for(int a = m; a<=n;a++){
             
              for(int i = 1;i<=10;i++){
         
            int result = i*a;
            
            System.out.println(a+" x "+i +" = "+result);
        }
             System.out.println("\n\n");  
         }
         
         
         
         
       
        
        
    }
    
    
    
    
    
}
