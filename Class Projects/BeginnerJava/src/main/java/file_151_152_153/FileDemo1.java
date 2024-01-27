
package file_151_152_153;
 
import java.io.File;

public class FileDemo1 {
    public static void main (String [] args){
        
//        File directory = new File("C:/Users/Sagor/OneDrive/Desktop/person");
//        directory.mkdir();//directory will be created
        
//        String directoryLocation=   directory.getAbsolutePath();
//        System.out.println(directoryLocation);
//        System.out.println(directory.getName());
//       
//        if(directory.delete()){
//            System.out.println(directory.getName()+ "Folder has been deleted");
//        }
        

        File directory = new File("person");
     directory.mkdir();//directory will be created
     String path = directory.getAbsolutePath();
        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");
        
       
        try{
        file1.createNewFile();
        file2.createNewFile();
            System.out.println("Files are created ");
        }catch(Exception e){
            System.out.println(e);
        }
        
//        file2.delete();
//        if(file2.exists()){
//            System.out.println("File exists");
//        }else{
//            System.out.println("File does not exist");
//        }
        
      
    }
}
