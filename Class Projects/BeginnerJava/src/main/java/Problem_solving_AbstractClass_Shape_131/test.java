
package Problem_solving_AbstractClass_Shape_131;
/*Question: Write an inheritance hierarchy for classes Rectangle,
Circle, triangle. Create an abstract class 
named Shape as super-class of the
hierarchy. Write an application that instantiates object of your
classes and output of their areas.
*/
public class test {
    public static void main(String[] args) {
        
        Shape shape;
        
        shape= new Rectangle(10, 20);
        shape.area();
        
        shape = new Triangle(10, 20);
        shape.area();
        
        shape = new Circle(10);
        shape.area();
        
        
    }
}
