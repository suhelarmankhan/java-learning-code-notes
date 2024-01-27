
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class PrimeNumber_51 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int count =0;
        
        System.out.print("Enter any positive integer: ");
        int num= input.nextInt();
        
        for(int i = 2; i<num;i ++){
            
            if(num % i==0){
                count++;
                break;
            }
    
        }
    
        if(count ==0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime");
        }
        
    }
}
