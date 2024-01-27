
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Start number: ");
            int m= input.nextInt();
          System.out.print("End number: ");
            int n= input.nextInt();
            
           int totalArmstrongNumber =0;
        
           for(int i = m; i<=n;i++){
               int r,temp,sum =0;
               
               temp = i;
               while(temp!=0){
               r = temp%10;
               sum = sum+r*r*r;
               temp = temp/10;
               }
                if(sum ==i){
              totalArmstrongNumber++; 
                    System.out.println(i+" ");
           }
           }
         
            System.out.println("Total armstrong numbers : "+totalArmstrongNumber);
        }
        
        
    }
}
