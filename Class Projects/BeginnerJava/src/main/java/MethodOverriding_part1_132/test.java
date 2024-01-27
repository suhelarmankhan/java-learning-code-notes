
package MethodOverriding_part1_132;

public class test {
    public static void main(String[] args) {
        
        Teacher t1= new Teacher();
        t1.name = "Sagor";
        t1.age = 21;
        t1.qualifation = "BSC in Chemistry";
        
        t1.displayInformation();
        
        Person p1= new Person();
        p1.name = "An";
        p1.age = 21;

   
        p1.displayInformation();
        
        
        
    }
}
