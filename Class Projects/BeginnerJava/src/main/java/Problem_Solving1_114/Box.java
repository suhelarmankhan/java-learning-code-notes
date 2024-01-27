
package Problem_Solving1_114;

public class Box {
                             //Problem - 1
 //To solve this problem knowledge required about class,objects,variables, data types,methods,constructor
/* 
Create a class called Box that include three pieces of 
information as instance variables-height,width and depth(type
double) of two boxes. Your class should have a constructor and initializes
the three instance variables. Provide a method displayVol that display the 
volume of two boxes. Suppose, the values of intance 
variables for the box's are (10,10,10) and second box's are (20,30,10).
write a test application named BoxVolume that demonstrate class Box's capabilities.
    */
       
    
    double height,width,depth;
    
    Box(double h,double w,double d){
        height= h;
        width = w;
        depth = d;
        
    }
    
    void displayVol (){
       double Volume = height*width*depth;
        System.out.println("Volume is :"+ Volume);
    }
    
    
    
}
