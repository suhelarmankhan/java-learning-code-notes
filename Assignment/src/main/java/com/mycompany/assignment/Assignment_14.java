
package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {
        
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Start number: ");
            int m = input.nextInt();
            System.out.print("End number: ");
            int n = input.nextInt();
     int totalPalindromeNumber=0;
     
               for (int i = m; i <= n; i++) {
                int temp, sum=0,r;
                temp = i;
                while(temp!=0){
                    r = temp%10;
                    sum=sum*10+r;
                    temp/=10;
                }if(sum==i){

                    totalPalindromeNumber++;
                    System.out.println(i+ " ");
                }
            }
 System.out.println("Total Palindrome numbers : " + totalPalindromeNumber);
        }
    }
}
