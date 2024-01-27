
package com.mycompany.bebinnerjava;

import java.util.Scanner;



public class ArithmeticOperator_15 {
    public static void main (String [] args){
        

        
        //1st part
        int num1,num2,result;
        
        num1 = 20;
        num2 = 10;
        
        result = num1 + num2;
        System.out.println("Sum = "+ result);
        
        result = num1 - num2;
        System.out.println("Sub = "+ result);
        
        result = num1 * num2;
        System.out.println("Multiplication = "+ result);
        
        result = num1 / num2;
        System.out.println("Div = "+ result);
        
        result = num1 % num2;
        System.out.println("Remainder = "+ result);
        
        
        
        //2nd part
        Scanner input = new Scanner(System.in);
        
        int number1,number2,celculation;
        
        System.out.print("\nEnter first number: ");
        number1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        number2 = input.nextInt();
        
        celculation = number1+ number2;
        System.out.println("Sum = "+ celculation);
        
        celculation = number1 - number2;
        System.out.println("Sub = "+ celculation);
        
        celculation = number1 * number2;
        System.out.println("Multiplication = "+ celculation);
        
        double celculation2 =(double) number1 / number2;
        System.out.println("Div = "+ celculation2);
        
        celculation = number1 % number2;
        System.out.println("Remainder = "+ celculation);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
