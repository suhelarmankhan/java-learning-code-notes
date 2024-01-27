package array_demo;

public class Array1_70 {
    public static void main(String[] args) {
        
     
        
        int[] number = new int[5]; 
        int []  number2 = new int[15];
        
        number[0] = 10;
        number[1] = 10;
        number[2] = 10;
        number[3] = 10;
        number[4] = 10;
   
       
        int sum = number[0]+ number[1]+number[2]+number[3]+number[4];
        System.out.println("Sum is: "+ sum);
        
        
        int length = number.length;
        System.out.println("Array size: "+length);
        
        
    }
}
