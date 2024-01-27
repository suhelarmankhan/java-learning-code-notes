
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_4 {
    public static void main (String [] args){
        
        try(Scanner input = new Scanner(System.in)){
            
            int phoneprice = 1800;
            int numberOfInstallment, installmentPerMonth;
            
            System.out.print("Number of your installment? ");
            numberOfInstallment = input.nextInt();
            
            installmentPerMonth = phoneprice / numberOfInstallment;
            
            System.out.println("Monthly installment Amount: "+installmentPerMonth+" euros");
      
        }
        
        
    } 
}
