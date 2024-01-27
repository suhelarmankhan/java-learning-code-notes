
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class VowelConsonant_26_27_28 {
    public static void main (String [] args){
        
        Scanner input = new Scanner(System.in);
        
        char character;
        
        System.out.print("Enter any letter: ");
        
        character = input.next().charAt(0);
        
        if(character == 'a'){
            System.out.println("Vowel");
        }else if(character == 'e'){
            System.out.println("Vowel");
        
        }else if(character == 'i'){
            System.out.println("Vowel");
        
        }else if(character == 'o'){
            System.out.println("Vowel");
        
        }else if(character == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consunant");
        }
        
        
        //--------------------------------------
        //locial or ||
        if(character == 'a' || character ==
                'e' || character =='i' || character=='o'
                        ||character =='u' || character=='i'){
            System.out.println("Vowel");
    }else{
            System.out.println("Consonant");
        }
    
    //locial and &&
     if(character>= 'a' && character <= 'z'){
            System.out.println("Small letter");
    }else{
            System.out.println("Capital letter");
        }
    
    
    
    
    
    }
    
}
