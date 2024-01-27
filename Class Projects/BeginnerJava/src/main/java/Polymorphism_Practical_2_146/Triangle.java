
package Polymorphism_Practical_2_146;

public class Triangle extends Shape{
    //area()
    
    double base, height;

    Triangle(double base, double height) {
    this.base = base;
    this.height = height;
    
    }
    
    @Override
    double area(){
        System.out.print("Area for triangle: ");
        return  0.5*base*height;
    }
    
}
