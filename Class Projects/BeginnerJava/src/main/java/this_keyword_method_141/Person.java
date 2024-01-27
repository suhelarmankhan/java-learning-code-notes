
package this_keyword_method_141;

public class Person {
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display(){
        this.message();
        System.out.println("I am display method");
    }
    
}
