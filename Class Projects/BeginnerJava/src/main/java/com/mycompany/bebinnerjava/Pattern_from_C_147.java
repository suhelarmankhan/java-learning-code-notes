
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class Pattern_from_C_147 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int N = input.nextInt();
        
        //---Pattern 01-------------
        for(int row =1; row<=N; row++){
            for(int col=1; col<=N-row; col++){
                System.out.print(" ");
            }
            
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
        
  //---Pattern 02-------------
        System.out.println("\n");
        for(int row=1; row<=N; row++){
            for(int col =1; col<=N-row; col++){
                System.out.print(" ");
            }
            
            for(int col =1;col<=row; col++){
                System.out.print(row);
            }
            
            System.out.println();
        }
        
        
         //---Pattern 03------------- 
        System.out.println("\n");  
        for(int row =1; row<=N; row++){
            for(int col =1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                int result = col%2;
                System.out.print(result);
            }
            System.out.println();
        }
   //---Pattern 04------------- 
        System.out.println("\n");
        for(int row=1; row<=N;row++){
            for(int col =1;col<=N-row; col++ ){
                System.out.print(" ");
            }
            for(int col =1; col<=row; col++){
                int result = row%2;
                System.out.print(result);
            }
            System.out.println();
            
        }
        
        
     //---Pattern 05-------------   
      for(int row =1;row<=N; row++){
          for(int col =1; col<=N-row;col++){
              System.out.print(" ");
          }
          for(int col =1; col<=row;col++){
              System.out.printf("%c",col+64);
          }
          System.out.println();
          
          
      }  
        
      //---Pattern 06-------------  
        for(int row=1; row<=N; row++){
            for(int col =1; col<=N-row; col++){
                System.out.print(" ");
            }
            for(int col =1; col<=row; col++){
                System.out.printf("%c",row+64);
            }
            System.out.println();
        }
        
     //---Pattern 07-------------    
     for(int row =1; row<=N; row++){
         for(int col =1; col<=N-row; col++){
             System.out.print(" ");   
         }
         for(int col =1; col<=row; col++){
             System.out.print("*");
         }
         System.out.println();
     }   
     
      //---Pattern 08-------------
     for(int row =1;  row<=N; row++){
         for(int col =1;col<=N-row; col++){
         System.out.print(" ");
         }
          for(int col =1; col<=row; col++){
              System.out.print("#");
          }
         System.out.println();
     }
        
    
     
    }
}
