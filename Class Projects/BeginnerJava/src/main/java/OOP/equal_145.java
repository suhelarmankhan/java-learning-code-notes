
package OOP;

public class equal_145 {
    public static void main(String[] args) {
        
        String password1 ="s fagor123";
        String password2 = "sagor123";
        String password3 = new String("sagor123");
        String password4 = new String ("sagor123");
        
        System.out.println(password1 == password2);
        System.out.println(password1 == password3);
        System.out.println(password3 == password4);
        
        System.out.println("\n");
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
    }
}
