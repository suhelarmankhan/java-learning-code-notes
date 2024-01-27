
package com.mycompany.bebinnerjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass_97 {
    public static void main(String[] args) {
        
        Date data = new Date();
        //System.out.println(data);
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(data);
        System.out.println("Current data: "+currentDate);
        
    }
}
