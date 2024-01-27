
package MethodOverriding_part1_132;

public class Teacher extends Person{

        //name,age,displayInformation()
        
        String qualifation;

          

        @Override
   void displayInformation(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
            System.out.println("Qualification: "+qualifation);

    

}

}