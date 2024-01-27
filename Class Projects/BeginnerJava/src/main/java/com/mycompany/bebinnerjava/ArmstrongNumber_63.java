
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class ArmstrongNumber_63 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){
            
            int r, temp, sum =0;
            
            System.out.print("Enter any number: ");
            int num = input.nextInt();
            
            temp = num;
            while(temp != 0){
                r = temp %10;
                sum = sum+r*r*r;
                temp = temp/10;
                
            }
            if(num == sum){
                System.out.println("Armstrong number");
            }else{
                System.out.println("Not armstrong number ");
            }
             
            
        }
        
    }
  
}
