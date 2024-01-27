
package OOP;

public class CallByReference_test_120 {
    public static void main(String[] args) {
        
        CallByReference_120 r1 = new CallByReference_120();
        r1.name = "Anis";
        System.out.println("before calling: "+r1.name);
        
        
        r1.change(r1);
        System.out.println("After calling :"+r1.name);
        
        
    }
}
