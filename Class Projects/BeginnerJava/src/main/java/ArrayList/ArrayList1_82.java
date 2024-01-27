package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1_82 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = "+number.size());
        
       
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
    
        
      /*  System.out.println(number);
        
        for(int x : number){
            System.out.println(" "+x);
       } */

    Iterator iterator = number.iterator();
    //while loop-----
    while(iterator.hasNext()){
        System.out.print(" "+iterator.next());
    }
    
        System.out.println();
        
        
    //for each loop---
    for(int i : number){
        System.out.print(" "+i);
    }
    
    
           System.out.println();
      //Removing elements----
       System.out.println("ArrayList contains: "+ number);
        number.remove(2);//remove one
        System.out.println("After removing ArrayList contains: "+ number);
        number.removeAll(number);
        System.out.println("After removig all: "+number);
    
    
    }
}
