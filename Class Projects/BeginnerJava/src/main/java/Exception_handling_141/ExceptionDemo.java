
package Exception_handling_141;

public class ExceptionDemo {
    public static void main(String[] args) {
        //1st---
        try{
             int x = 10;
        int y = 0;
        int result = x /y;
        
        System.out.println("Result: "+result);
        }catch(ArithmeticException e1){
            System.out.println("Exception: "+e1);
        }catch(Exception e2){
            System.out.println("Exception: "+e2);
        }
       
        finally{
        System.out.println("Last line of the Program"); 
        }
        
 
        
        
        //2nd---
         try{
            int []a = new int [4]; 
            a [4] =  10;
        
        }catch(ArithmeticException e1){
            System.out.println("Exception: "+e1);
        }catch(Exception e2){
            System.out.println("Exception: "+e2);
        }
       
        finally{
        System.out.println("Last line of the Program"); 
        }
        
        
        
    }
    
}
