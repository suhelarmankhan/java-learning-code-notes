package array_demo;

public class for_each_loop_73 {
    public static void main(String[] args) {
        
    //String [] names = new String[4];
    String []  names = {"Sagor","Bangla","Tinko","Sahed"};
    
   
    /*names[0] = "Sagor";
    names[1] = "Bangla";
    names[2] = "Tikno";
    names[3] = "Sahed"; */
   
       /* System.out.println(names.length);
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
        } */
       
       for(String x : names){
           System.out.println("All names: "+x);
       }
       
       
       int [] number = {10,20,30,40,50,60,70,80,90,100};
       int sum = 0;
       
       for(int x : number){
           sum = sum+x;
           
       }
        System.out.println("The sum is: "+sum);
       
       
       
}
}
