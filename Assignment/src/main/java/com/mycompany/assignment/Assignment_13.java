package com.mycompany.assignment;
import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        
        
      try (Scanner input = new Scanner(System.in)) {
      System.out.print("Which Fibonacci number do you want to see? ");
      int n = input.nextInt();

      int first = 0;
      int second = 1;
      int result = 0;

      if (n == 0) {
        result = first;
      } else if (n == 1) {
        result = second;
      }  else {
        for (int i = 2; i <= n; i++) {
          result = first + second;
          first = second;
          second = result;
        }
      }

      System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
  }
}

