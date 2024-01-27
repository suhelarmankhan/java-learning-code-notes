
package OOP;

public class CallByValue_test_120 {
    public static void main(String[] args) {
        
        CallByValue_120 object = new CallByValue_120();
        
        int x =10;//premitive data type
        System.out.println("X before call: "+ x);
        
        object.change(x);
        System.out.println("X after call: "+x);
        
        
    }
}
