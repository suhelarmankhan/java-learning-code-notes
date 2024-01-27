
package Problem_solving_AbstractClass_Shape_131;

import java.text.DecimalFormat;

public class Circle extends Shape{
     //come - dim1, dim2 from Shape class
    
    //circle are = 3.1416 *r *r
    Circle(double r){
       super(r,r);
    }
    
    
    @Override
    void area(){
        double result  =Math.PI* dim1*dim2;

        
        // Creating a DecimalFormat object with a specific pattern
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatting the area to display with reduced precision
        String formattedArea = df.format(result);

        // Displaying the formatted area
        System.out.println("Circle Area: " + formattedArea);
        
    }
}
