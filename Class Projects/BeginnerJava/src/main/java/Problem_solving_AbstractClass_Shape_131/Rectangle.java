
package Problem_solving_AbstractClass_Shape_131;

public class Rectangle extends Shape{
    //come - dim1, dim2 from Shape class
    
    
    Rectangle (double dim1, double dim2){
       super(dim1,dim2);
    }
   
    @Override
    void area(){
        double result  = dim1*dim2;
        System.out.println("Rectangle area: "+ result);
    }
    
}
