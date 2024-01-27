
package TypeCasting_Upcasting_Downcasting_138;

public class test {
    public static void main(String[] args) {
//sub class ar object ke super class er modhe rekhe dilam..
//ata type casting
       Person p = new Teacher(); //upcasting
       p.display();
       
       Teacher t =(Teacher) new Person();
       t.display();
    }
 
}
