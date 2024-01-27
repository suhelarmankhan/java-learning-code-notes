
package string_package;

public class StringBuffer_90 {
    public static void main(String[] args) {
        
        
        
       StringBuffer sb = new StringBuffer("Suhel");
        System.out.println(sb);
        
        sb.append(" Arman Khan ");
        sb.append(39);
        System.out.println(sb);
  
        sb.delete(0, 3);
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
 
        sb =new StringBuffer("suhel arman khan");
        
        sb.reverse();
        System.out.println(sb);
        
        
        
    }
}
