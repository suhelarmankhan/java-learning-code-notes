
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int N = input.nextInt();
        
       for(int row = 1; row<=N; row++){
           for(int col = 1; col <=row; col++){
               int result = col%2;
               
               System.out.print(result);
               
           }
           System.out.println();
       } 
        
        
        
    }
 
}
