package com.mycompany.assignment;
import java.util.Scanner;
public class Product_3 {
    
    public static void main (String[] args){
   
        int id,price;
        String titile,description,category;
        
        Scanner intInput = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
  
        
        System.out.print("Enter id: ");
        id = intInput.nextInt();
        
        System.out.print("Enter title: ");
        titile = inputString.nextLine();
        
        System.out.print("Enter price:   ");
        price = intInput.nextInt();
        
        System.out.print("Enter description: ");
        description = inputString.nextLine();
        
        System.out.print("Enter cagtegory: ");
        category = inputString.nextLine();
        
        
        
        System.out.println("\n\nid: "+id);
        System.out.println("title: "+ titile);
        System.out.println("price: "+ price);
        System.out.println("description: "+description);
        System.out.println("category: "+ category);
   
    }
}
    