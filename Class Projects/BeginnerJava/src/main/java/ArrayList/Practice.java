
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;



public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-23);
        number.add(2,69);
        number.add(34);
        
        System.out.println(number);
        
        Collections.sort(number);
        System.out.println(number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println(number);        
        
    }
  
}
