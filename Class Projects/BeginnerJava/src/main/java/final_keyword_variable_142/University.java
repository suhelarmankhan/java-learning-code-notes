
package final_keyword_variable_142;

public class University {
   final String UNIVERSITY_NAME = "National University";
    final int fees;//blank final variable
      static  final String address;// static blank final variable
    
      
      static{
          address = "dhaka";
      }
      
    University(){
        fees = 3953;
    }
    
    
    void display(){

        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
    }
}
