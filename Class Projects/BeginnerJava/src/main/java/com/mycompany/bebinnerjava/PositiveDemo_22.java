
package com.mycompany.bebinnerjava;

import java.util.Scanner;


public class PositiveDemo_22 {
    public static void main (String [] args){
      Scanner input = new Scanner(System.in);
      
      int num;
      
     
      System.out.print("Enter any integer: ");
      num = input.nextInt();
      
      if(num>0){
          System.out.println("Position");
      }else if(num<0){
          System.out.println("Negative");
      }else{
          System.out.println("Equal to zero");
      }
      
        
        
    }
    
}
