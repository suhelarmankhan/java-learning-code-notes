package com.mycompany.bebinnerjava;
import java.util.Scanner;

public class InputDemo_13 {
    
   public static void main (String[] args){
       
       int number = 120;
       String name;
       double value;
       
     Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = input.nextLine();
    
     
      System.out.print("Enter any number: ");
      number = input.nextInt();


     System.out.print("Enter any double value: ");
     value = input.nextDouble();
     
    
    System.out.println("\n\nWelcome: "+name);
    System.out.println("Your int = "+number);
    System.out.println("Your double = "+value);
      
       
       
   }
            
    
}   