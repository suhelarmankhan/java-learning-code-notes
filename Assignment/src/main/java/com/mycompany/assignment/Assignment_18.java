package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment_18 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            String[] weekdays = {"Monday", "Tuesday",
                 "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

            System.out.print("Please enter day number (1-7): ");
            int day_number = input.nextInt();
                
            // 1st 
           /* int result = day_number - 1;
            System.out.println(weekdays[result]); */
           
           //2nd
            for (int i = 0; i <weekdays.length; i++) {
                
                if(i==day_number-1){
                    System.out.println(weekdays[i]);
                }
                
            }
            
            
           
           

        }

    }

}
