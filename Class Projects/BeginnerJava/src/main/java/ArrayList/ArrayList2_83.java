
package ArrayList;

import java.util.ArrayList;

public class ArrayList2_83 {
   
    public static void main(String[] args) {
        
        ArrayList <Integer> number = new ArrayList();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
      
        
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty: "+check);
        
        
        boolean contains =number.contains(30);
        System.out.println("30 is in the list: "+contains);
        
        
      int position =  number.indexOf(40);
        System.out.println("The index of 40 is: "+position);
        
        number.set(3, 50);// replace
        System.out.println("After setting: "+number);
        
        int x =number.get(0);
        System.out.println("Index 0 = "+x);
        
        
         number.clear();
        System.out.println("After Clear: "+number);
      
    }
 
}
    
    

