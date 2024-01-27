
package string_package;

public class String2_87 {
    public static void main(String[] args) {
        
        String firstName = "Suhel Arman";
        String lastName = " Khan";
        
        String fullName = firstName+lastName;
        System.out.println("Full name = "+fullName);
        
        //cancat----
        String fullname = firstName.concat(lastName);
        System.out.println("Full name = "+fullname);
        //toUpperCase
        String upperName = fullName.toUpperCase();
        System.out.println("UpperName = "+upperName);
        //toLowerCase
        String lowerName = fullName.toLowerCase();
        System.out.println("LowerName = "+lowerName);
        //startsWith
        boolean startwith = firstName.startsWith("S");
        System.out.println("b = "+startwith);
        //endsWith
        boolean endsWith = firstName.endsWith("n");
        System.out.println("Last = "+endsWith);
        //string array
        String [] names = {"oishi","sagor","anis"};
        for(String x: names){
            System.out.println(x);
        }
        
    }
}
