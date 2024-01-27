
package file_151_152_153;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        
        
        try{
      File file = new File("C:/Users/Sagor/OneDrive/Documents/NetBeansProjects/Class Projects/BeginnerJava/person") ;
    Scanner scanner= new Scanner(file);
    
    while(scanner.hasNext()){
        String id = scanner.next();
        String name = scanner.next();
        System.out.println("ID: "+id+" Name: "+name);
    }
    
    scanner.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
