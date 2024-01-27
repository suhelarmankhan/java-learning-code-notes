package OOP;

public class MathClass_116 {
    
    public static void main(String[] args) {
        
        int x = Math.abs(-9);
        System.out.println(x);// 9
        System.out.println(Math.abs(-9.5));//9.5
        System.out.println("square root: "+Math.sqrt(25));//5.0
        System.out.println("Cube root: "+Math.cbrt(27));//3.0
        System.out.println("2 to the power 3: "+Math.pow(2, 3));//8.0
        System.out.println(Math.PI);//3.141592653589793
        System.out.println(Math.log(2.0));//0.6931471805599453
        System.out.println(Math.exp(1.0));//2.718281828459045
        System.out.println(Math.max(-2.3, -12.8));//-2.3
        System.out.println(Math.min(-2.3, -12.8));//-12.8
        System.out.println(Math.ceil(-5.6));//-6.0
        System.out.println(Math.floor(-5.6));//-5.0
        System.out.println(Math.ceil(-5));//-5.0
        System.out.println(Math.floor(-6));//-6.0
        System.out.println(Math.round(4567.9874));//4568
        System.out.println(Math.random());//randow number
        
        Double d  = Math.min(Math.floor(5.9), 6.5);
        System.out.println(d);

    }
}
