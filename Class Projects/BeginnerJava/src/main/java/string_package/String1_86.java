
package string_package;

public class String1_86 {
    public static void main(String[] args) {
       
    String s1 =  "suhel Arman Khan";  
    String s2 = new String("Suhel Arman Khan");    
     
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+ s2);
    
        int len =s1.length();
        System.out.println("Lenght of s1 = "+len);
        
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
        
         if(s1.contains(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       
       
         if(s1.equalsIgnoreCase(s2)){
             System.out.println("Equals");
         }else{
             System.out.println("Not equals");
         }
         
         
         
       boolean con =  s1.contains("ami");
        System.out.println(con);
        
      boolean con2=  s1.contains("Arman");
         System.out.println(con2);
        
    
    boolean b = s1.isEmpty();
        System.out.println(b);
    
    }
 
}
