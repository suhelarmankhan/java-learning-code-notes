
package HashMap_149;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //put, get
        HashMap <Integer,String> customer = new HashMap<Integer, String>();
        
        customer.put(101,"Sagor");
        customer.put(102,"oishi");
        customer.put(103,"shuvu");
        customer.put(104,"Rajesh");
    
        
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        System.out.println(customer.get(104));
        
        
    }
}
