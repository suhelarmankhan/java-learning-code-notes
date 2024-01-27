
package OOP;

public class StaticBlock_112 {
    
    static int id;
    static String name;
    
    static{
        id = 10;
        name = "sagor";
        System.out.println("Static block");
    }
    
     static void display(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
         System.out.println("main method");
    }
     
     public static void main(String[] args) {
        
        StaticBlock_112.display();
    }
}
