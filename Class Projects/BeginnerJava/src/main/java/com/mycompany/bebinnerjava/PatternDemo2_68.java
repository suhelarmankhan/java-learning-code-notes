
package com.mycompany.bebinnerjava;

import java.util.Scanner;

public class PatternDemo2_68 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter line number: ");
        int num = input.nextInt();
        
        
        for(int row =num; row>=1; row--){
            for(int coulmn = 1; coulmn<=row; coulmn ++){
                System.out.print(coulmn);
            }
            System.out.println("");
        }
        
        
    }
}
