
package array_demo;

import java.util.Scanner;

public class MatrixPart3_78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int [] [] A = new int[3] [3];
         int sumOfDiagonalElements =0;
         int sumOfUpperElements =0;
           int sumOfLowerElements =0;
         //Matrix input
         for (int row = 0; row < 3; row++) {
             for (int col = 0; col < 3; col++) {
                 System.out.printf("A [%d][%d] = ",row,col);
                 A [row] [col] = input.nextInt();
             }
        }
        
        //diagonal, Upper, Lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
   
 //je golar row & column ar index same se gola hocce diagonal element 
                if(row == col){
                    sumOfDiagonalElements = sumOfDiagonalElements+ A[row][col];
                }
//row ar ceye column index boro hole segolo upper trayengal elements
        if(row<col){
            sumOfUpperElements = sumOfUpperElements+ A[row][col];
        }
        
 //column ar ceye row ar index boro hole segolo lower traengal elements
        if(row>col){
            sumOfLowerElements = sumOfLowerElements+ A[row][col];
        }
          }
        }
         
        System.out.println("Sum of diagonal elements: "+ sumOfDiagonalElements); 
 System.out.println("Sum of upper elements: "+ sumOfUpperElements); 
         System.out.println("Sum of lower elements: "+ sumOfLowerElements); 


    }
 
}
