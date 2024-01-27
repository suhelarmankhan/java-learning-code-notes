
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
        
         Scanner input  = new Scanner(System.in);
           String username = "sagor",password="123456";
       
       int i = 1;
      do{
          System.out.print("Username: ");
          String user = input.nextLine();
          
          System.out.print("Password: ");
          String pass = input.nextLine();
          
          if(user.equals(username) && pass.equals(password)){
              System.out.println("welcome to the system");
                 i =2;
          }else{
              System.out.println("username/password is incorrect. Please try again");
           
          }
          
      }while(i<= 1);
       
 
    }
  
}
