
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_11 {
     public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //for loop
        int x,i,fact=1;
        System.out.print("Enter a number: ");
        x = input.nextInt();
        for(i=1;i<=x;i++){
            fact = fact*i;
        }
        System.out.println("Factorial = "+fact);

    }

}
