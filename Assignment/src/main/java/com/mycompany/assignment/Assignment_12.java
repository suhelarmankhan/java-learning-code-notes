package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        int startNumber, endNumber;
        
        System.out.print("First number: ");
        startNumber = input.nextInt();
        
        System.out.print("Second Number: ");
        endNumber = input.nextInt();
     
        //Odd numbers
        for(int i = startNumber; i <=endNumber; i++){
   
          if(i%2 !=0){
              System.out.println("Odd Number: "+ i);
          }
          
         
        }
        //Even numbers
         for(int i = startNumber; i <=endNumber; i++){
   
          if(i%2 ==0){
              System.out.println("\n\nEven Number: "+ i);
          }
          
         
        }
  
    }
}
