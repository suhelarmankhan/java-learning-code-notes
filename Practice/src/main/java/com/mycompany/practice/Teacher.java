
package com.mycompany.practice;

public class Teacher extends Person{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public void display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress());
        System.out.println("\n");
    }
    
    
}
