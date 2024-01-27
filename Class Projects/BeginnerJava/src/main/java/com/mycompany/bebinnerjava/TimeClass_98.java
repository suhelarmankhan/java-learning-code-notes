
package com.mycompany.bebinnerjava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass_98 {
    public static void main(String[] args) {
        
        LocalTime time  = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
