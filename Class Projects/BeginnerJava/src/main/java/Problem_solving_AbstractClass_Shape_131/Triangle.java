
package Problem_solving_AbstractClass_Shape_131;

public class Triangle extends Shape{
     //come - dim1, dim2 from Shape class
    
    
    Triangle (double dim1, double dim2){
       super(dim1,dim2);
    }
   
    @Override
    void area(){
        double result  =0.5* dim1*dim2;
        System.out.println("Triangle area: "+ result);
    }
}
