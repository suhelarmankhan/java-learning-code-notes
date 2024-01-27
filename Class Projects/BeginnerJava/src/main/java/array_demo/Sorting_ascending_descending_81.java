
package array_demo;

import java.util.Arrays;

public class Sorting_ascending_descending_81 {
    public static void main(String[] args) {
        
        int []  number = {10,-3,18,5,25};
        
        Arrays.sort(number);
        
        
        
        System.out.print("Ascending: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
        }
        
        System.out.println();
        System.out.print("Descending: ");
        for (int i = 4; i >=0; i--) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        
        String [] names = {"sagor","sujoy", "niloy","anis"};
        
        Arrays.sort(names);
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+names[i]);
        }
        
        System.out.println();
         for (int i = 3; i >=0; i--) {
            System.out.print(" "+names[i]);
        }
    }
}
