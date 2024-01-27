
package array_demo;

import java.util.Scanner;

public class Array_sum_and_average_71 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double [] number = new double[5];
        
        double sum =0;
        
        System.out.print("Please Enter 5 numbers: ");
        
     /*   number[0]= input.nextDouble();
        number[1] = input.nextDouble();
        number[2]= input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble(); */
        
     for(int i =0; i<number.length; i++){
         number[i] = input.nextDouble();
     }
        
     
        for (int i = 0; i < number.length; i++) {
            sum= sum+number[i];
        }
     
       // sum = number[0]+number[1]+number[2]+ number[3]+number[4];
        
        System.out.println("The sum is: "+ sum);

        double avg = sum/number.length;
        System.out.println("Average is : "+ avg);
        
    }
  
}
