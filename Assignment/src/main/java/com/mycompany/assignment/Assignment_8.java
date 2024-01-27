
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_8 { 
    public static void main (String [] args){
        Scanner input  = new Scanner (System.in);
        char ans1,ans2;
        
        System.out.print("Have you completed your masters? y/n ");
        ans1 = input.next().charAt(0);
        
        System.out.print("Are you fluent in english? y/n ");
        ans2 = input.next().charAt(0);
        
        if((ans1=='y'&& ans2== 'y')){
            System.out.println("You are eligible to for the job interview");
        }else{
            System.out.println("Sorry. You are not eligible to for the job interview");
        }
        
        
    }
    
}
