
package OOP;

public class static_variable1_107 {
    
    String name;
    int id;
    static String universityName= "National University";
    
    
    static_variable1_107(String nameD,int idD){
        name = nameD;
        id = idD;
        
    }
    
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("University name: "+universityName);
        System.out.println("\n");
    
    }
}
