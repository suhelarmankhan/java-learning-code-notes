
package OOP;

public class TypesOfConstructor_104 {
    String name,gender;
    int phone;
    
    //---Parametrized constructor
    TypesOfConstructor_104(String nameD,String genderD, int phoneD){
        
        name = nameD;
        gender = genderD;
        phone = phoneD;
    }
    
    //Default constructor
    TypesOfConstructor_104() {
        System.out.println("No value");
    }
    
    
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("\n");
    }
    
}
