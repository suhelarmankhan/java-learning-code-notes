
package OOP;

public class Inheriting_Private_Member_setters_getters_2_129 extends Inheriting_Private_Member_setters_getters_1_129{
   //getName(), setName(), setAge(), getAge()
   
   private String qualification ;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
   

   void displayInformation(){
        
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        System.out.println("\n\n");
   }
   
    
}
