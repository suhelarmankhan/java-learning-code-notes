
package OOP;

public class Teacher_test_100 {
    public static void main(String[] args) {
        //-=--1st
        Teacher_100 teacher1;//object declare
       teacher1 = new Teacher_100();//create
       teacher1.name = "Anisul Islam";
       teacher1.gender = "male";
       teacher1.phone = 902386096;
       teacher1.displayInformation();
       
//       System.out.println("Name: "+teacher1.name);  
//        System.out.println("Gender: "+teacher1.gender);
//        System.out.println("Phone: "+teacher1.phone);
        
        
        System.out.println();
        
        //----2nd
        Teacher_100 teacher2;//object declare
       teacher2 = new Teacher_100();//create
       teacher2.name = "Suhel Arman Khan";
       teacher2.gender = "male";
       teacher2.phone = 975404979;
       teacher2.displayInformation();
       
//        System.out.println("Name: "+teacher2.name);  
//        System.out.println("Gender: "+teacher2.gender);
//        System.out.println("Phone: "+teacher2.phone);
   }
}
