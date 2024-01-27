
package LinkedList_146_147;

import java.util.LinkedList;

public class StudentList_148 {
    public static void main(String[] args) {
        
        //student linkedlist
        LinkedList<Student_148> list = new LinkedList<Student_148>();
        
        //student create
        Student_148 s1 = new Student_148(101,"Karim","Eleven");
        Student_148 s2 = new Student_148(102,"Rahim","Eleven");
        Student_148 s3 = new Student_148(103,"Habib","Eleven");
        Student_148 s4 = new Student_148(104,"Rumel","Eleven");
        
        
        //adding student to the studentlist
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
       //information display
       for(Student_148 s: list){
           System.out.println(s.id+" "+ s.name+ " "+ s.className);
    }
       
    }
 
}
