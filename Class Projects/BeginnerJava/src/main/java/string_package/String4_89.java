
package string_package;

public class String4_89 {
    public static void main(String[] args) {
        
        String s1 = "This is my country";
        System.out.println(s1);
        
        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        
       String [] s3 = s1.split(" ");
       for(String x : s3){
           System.out.println(x);
       }
       
       
    }
 
}
