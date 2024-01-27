
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class FindFactorial_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int result =1;
        int n;
        
        
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        
        for(int i = n;i>=1; i--){
            System.out.println("i = "+ i);
            result = result*i;
        }
        System.out.println("Factorial of "+n+":  "+ result);
        
    }
}
