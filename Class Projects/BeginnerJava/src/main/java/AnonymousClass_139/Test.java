
package AnonymousClass_139;

public class Test {
    public static void main(String[] args) {
        
     Person p = new Person(){
         
         @Override
         void display(){
             System.out.println("Test Class");
         }
     };
        
        p.display();
    }
}
