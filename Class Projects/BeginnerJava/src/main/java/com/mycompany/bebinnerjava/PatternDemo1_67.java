
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class PatternDemo1_67 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    
       //----01----
        System.out.print("Please enter line number: ");
        int n = input.nextInt();
        //----01----
        for(int row =1;row<=n;row++){
            
            for(int column = 1;column<=row;column++){
                
                System.out.print(" "+column);
               
            } 
            
            System.out.println();
            
        }
        
           //----02----
        System.out.print("Enter star line number: ");
        int m = input.nextInt();
        
        for(int row=1; row<=m; row++){
            
            for(int column = 1; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        
           //----03----
        System.out.print("Enter # and ^ line number: ");
       int p = input.nextInt();
       
       for(int row=1;row<=p; row++){
           for(int column = 1; column<= row; column++){
               System.out.print("#");
           }
       
           System.out.println();
       }
       
        for(int row=1;row<=p; row++){
            
            for(int  column = 1; column <=row; column++ ){
                System.out.print("^");
            }
            
            System.out.println(" ");
            
        }
    }
}
