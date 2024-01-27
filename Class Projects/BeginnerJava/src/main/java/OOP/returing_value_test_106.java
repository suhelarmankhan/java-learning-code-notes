
package OOP;

public class returing_value_test_106 {
    public static void main(String[] args) {
        //---int
        returing_value_106 object1 = new returing_value_106();
      //  int result = object1.square(5);
        System.out.println("result of 5 = "+object1.square(5));
        
        returing_value_106 object2 = new returing_value_106();
        //  int result = object1.square(6);
        System.out.println("result of 6 = "+object1.square(6));
        
        
        //String
        returing_value_106 stringObject1 = new returing_value_106();
        System.out.println(stringObject1.me("Md Suhel Arman", "Khan"));
        
        returing_value_106 stringObject2 = new returing_value_106();
        System.out.println(stringObject2.me("Anisul", "Islam"));
        
        
        
    }
}
