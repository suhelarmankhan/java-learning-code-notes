
package string_package;

public class Practice {
    public static void main(String[] args) {
 
        StringBuffer sb = new StringBuffer("Afroja Akter Oishi ");
        System.out.println(sb);
        
        sb.append(34);
        System.out.println(sb);
        
        
        sb.delete(13, 18);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
      sb.setLength(10);
        System.out.println(sb);
    }
  
}
