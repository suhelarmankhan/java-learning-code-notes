
package com.mycompany.bebinnerjava;

import java.util.Random;



public class RandomNumberGenerator_99 {
    public static void main(String[] args) {
        
        //1st----------
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1; //1 to 10
        System.out.println("Random number = "+randomNumber);
    
        
        System.out.println();
        //2nd ----------
        int randomNumber2 =(int) (Math.random()*10)+1;
        System.out.println("Random number = "+randomNumber2);

        
    }
 
}
