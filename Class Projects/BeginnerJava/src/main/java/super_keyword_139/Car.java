
package super_keyword_139;

public class Car extends Vehicle{
    //color,weight, attritube()
int gear;

Car(String c,double w, int g){
    super(c,w);//calling the constructor of vehicle class
    gear = g;
}

@Override
void attribute(){
     super.attribute();
        System.out.println("Gear: "+gear);
}

}
