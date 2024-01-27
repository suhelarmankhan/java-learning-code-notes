
package string_package;

public class StringBuilder_92 {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Sagor");
        
        System.out.println("str = "+str);
        
        str.append("Khan");
        str.append(64);
        str.append(32.34);
       
        System.out.println("str = "+str);
        
        str.reverse();
        System.out.println(str);
        
        str.delete(3, 10);
        System.out.println(str);
        
    }
}
