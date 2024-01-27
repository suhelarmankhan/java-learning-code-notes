
package LinkedList_146_147;

import java.util.LinkedList;

public class LinkedList_part2_147 {
    public static void main(String[] args) {
        
        LinkedList <String > countryNames = new LinkedList<String>();
       
        
        countryNames.add("Afghanistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        //countryNames.remove("Japan");
        //countryNames.remove(7);
        //countryNames.removeFirst();
       // countryNames.removeLast();
        
       
        
        System.out.println(countryNames);
        
        for(String country: countryNames){
            System.out.println( country);
        }
        
       
        System.out.println("Size of the likedlist: "+countryNames.size());
    
        System.out.println("First element: "+countryNames.getFirst());
        System.out.println("Last element: "+countryNames.getLast());
        
        countryNames.clear();
        System.out.println(countryNames);
    
    
    }
}
