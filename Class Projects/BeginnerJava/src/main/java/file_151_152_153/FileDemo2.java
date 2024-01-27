
package file_151_152_153;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {
 
     String id, name;   
        
     try{
     Formatter formatter = new Formatter("C:/Users/Sagor/OneDrive/Documents/NetBeansProjects/Class Projects/BeginnerJava/person/student.txt");  
   
     Scanner input = new Scanner(System.in);
         System.out.print("How many students: ");
         int num = input.nextInt();
         
         for (int i = 0; i <= num; i++) {
             System.out.println("Enter student id and name: ");
             id = input.next();
             name = input.next();
              formatter.format("%s %s\r\n",id,name);
         }
     
//     formatter.format("%s %s\r\n","101","Sagor");
//     formatter.format("%s %s\r\n","102","Polash");
//     formatter.format("%s %s\r\n","103","Arman");
//     formatter.format("%s %s\r\n","104","Suhel");
     
      formatter.close();
     }catch(FileNotFoundException e){
         System.out.println(e);
     }   
        
        
    }     
   
      
}
