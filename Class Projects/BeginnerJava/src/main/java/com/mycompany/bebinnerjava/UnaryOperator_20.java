
package com.mycompany.bebinnerjava;

public class UnaryOperator_20 {
    
  public static void main (String [] args){
      
      int x = 10;
      int result;
      
      //+x
      result = +x; //output: +10
      System.out.println("result: "+ result);
      
      //-x
      result = -x; //output: -10
      System.out.println("result: "+ result);
      
      
      //-----Increment & Decrement--------
      int a =25;
      int b;
      
      //post increment
      b = a++;//a = 25
      System.out.println("b = "+ b);
      
      b = a; //a = 26
      System.out.println("b = "+ b);
      
      //Pre increment
      b = ++a; //a = 27
      System.out.println("b = "+ b);
      
      b = a;//a= 27
      System.out.println("b = "+ b);
      
      
      
      
      
      //post decrement
      b = a--;//a = 27
      System.out.println("b = "+ b);
      
      b = a;//a = 26
      System.out.println("b = "+ b);
      
      //Pre decrement
      b = --a; //a = 25
      System.out.println("b = "+ b);
      
      b = a;//a= 25 
      System.out.println("b = "+ b);
      
      
      //----- last final increment decrement
      a = 25;
      
      b = --a;//a = 24
      System.out.println("b = "+b);
      
      b = a--;//a= 24;
      System.out.println("b = "+ b);
      
      b = ++a;// a=24
      System.out.println("b = "+ b);
      
      b = a ++;// a = 24
      System.out.println("b = "+ b);
      
      
      b= a; //a = 25
       System.out.println("b = "+ b);
      
      
      
      
      
  }
  
  
    
}
