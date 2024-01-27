
package OOP;

public class Overloading_constructor_105 {
    String name,gender;
    int phone;

     Overloading_constructor_105() {
         System.out.println("No Information");
         System.out.println("\n");
    }
    
    Overloading_constructor_105(String nameD,String genderD){
        name = nameD;
        gender = genderD;
        System.out.println("\n");

    }
    
    Overloading_constructor_105(String nameD, String genderD, int phoneD){
          name = nameD;
        gender = genderD;
        phone = phoneD;
        System.out.println("\n");

    }
    
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        
    }
    
}
