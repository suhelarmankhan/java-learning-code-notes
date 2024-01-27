
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class Temperature_19 {
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        
        //Calsius to fahrenheit
        double Celsicus,Fahrenheit;
        
        System.out.print("Celsicus = ");
        Celsicus = input.nextDouble();
        
        Fahrenheit = 1.8*Celsicus + 32;
        System.out.println("Fahrenheit = "+ Fahrenheit);
        
        
        //Fahrenheit to celsius
        double fahrenheit,Celsius;
       
        System.out.print("\nFahrenheit= ");
        fahrenheit = input.nextDouble();
        
        Celsius = 0.56*(fahrenheit - 32);
        System.out.println("Celsius = "+ Celsius);
        
        
        
        
        
        
        
    }
    
}
