
package this_keyword_variable_constructor_140;

public class Person {
    String name;
    int age;
    String haircolor;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
      Person(String name, int age,String hairColor){
         this(name,age);
        this.haircolor = hairColor;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("HairColor: "+haircolor);
    }
    
}
