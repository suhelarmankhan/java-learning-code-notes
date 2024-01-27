
package string_package;

public class String3_88 {
    public static void main(String[] args) {
        
        String country = "Bangladesh is my country   ";
        System.out.println(country);
                
        
        String s3 = country.trim();
        System.out.println(s3);


        char ch = country.charAt(3);
        System.out.println("ch = "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Valuse = "+value);

        int position = country.indexOf("is");
        System.out.println("First position of is = "+position);
        position = country.lastIndexOf('t');
        System.out.println("Last position of n = "+position);
        
        
    }
 
}
