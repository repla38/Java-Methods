package JavaMethods.MethodOverloading;

public class MethodOverloading {
    
    /*  
    For easier reading and coding, two different methods can have 
    the same name as long as their parameter lists are different 
    */
    
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        /*
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)
         */

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
