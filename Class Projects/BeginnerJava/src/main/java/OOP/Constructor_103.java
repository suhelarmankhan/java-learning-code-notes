
package OOP;

public class Constructor_103 {
    
    String name,gender;
    int phone;

   Constructor_103 (String nameD,String genderD, int phoneD){
       name = nameD;
       gender = genderD;
       phone = phoneD;
       
   }
    
   void displayInformation (){
       System.out.println("Name = "+name);
       System.out.println("Gender = "+gender);
       System.out.println("Phone = "+phone);
       System.out.println("\n");
   }
    
    
}
