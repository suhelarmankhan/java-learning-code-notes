
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class LoopDemo_46 {
    public static void main(String[] args) {
      
      //sum of 1 to 10  
      int sum = 0;
        for(int i = 1; i <=10;i++){
            sum = sum+i;
        }
          System.out.println("Sum of 1 to 10: "+sum);

        
        //sum of m to n
       Scanner input  = new Scanner(System.in);
        int m,n;
       int sum_m_TO_n=0;
       int sum_Even = 0;
       int sum_Odd = 0;
            
            
        System.out.print("Start: ");
       m = input.nextInt();
       
        System.out.print("End: ");
       n = input.nextInt();
        
      for(int a = m; a<=n;a++){
          sum_m_TO_n = sum_m_TO_n+ a ;
          
          //for even numbers
          if(a%2 ==0){
              sum_Even = sum_Even+a;
              System.out.print(" "+a);

          }
          
          if(a%2 !=0){
              sum_Odd = sum_Odd+a;
              System.out.print("\n"+a);
              
          }
   
          }
         System.out.println();
        System.out.println("Sum of Even m to n: "+ sum_Even);
        System.out.println("Sum of Even m to n: "+ sum_Odd);
        System.out.println("Sum of m to n: "+sum_m_TO_n);
 
    }
}
