    
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class Series_part2_48 {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);

       int n,result=1,result2 =1 , result3 = 1;
       
       
        System.out.print("Enter the last number: ");
       n = input.nextInt();
       
       //1x2x3x4x.......x n
       for(int i = 1; i<=n; i++){
           System.out.print(i+" ");
           result = result*i;
           
       }
        System.out.println();
        System.out.println(result);
       
        //1 x 3 x 5 x....... x n
         for(int i = 1; i<=n; i=i+2){
           System.out.print(i+" ");
           result2 = result2*i;
           
       }
        System.out.println();
        System.out.println(result2);
       
        
        //1^2 x 2^2 x 3^2 x 4^2 x ........ x n^2
        for(int i = 1; i<=n;i ++){
            System.out.print(i+" x ");
            result3= i*2;
            
        }
          System.out.println();
          System.out.println(result3);
        
        
        //1.5 x 2.5 x 3.5 x .....x n
          float m;
          System.out.print("Enter the last number: ");
        m = input.nextFloat();
        float result4 = 1; 
        
         for(float i = (float) 1.5; i<=m; i++){
           System.out.print(i+" ");
           
           result4*=i;
       }
        System.out.println();
        System.out.println("1.5 x 2.5 x 3.5 x .....x n = "+result4);
       
        
    }
}
