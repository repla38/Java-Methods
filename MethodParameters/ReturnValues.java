package JavaMethods.MethodParameters;

/*
If you want the method to return a value, you can 
use a primitive data type (such as int, char, etc.) instead 
of void, and use the return keyword inside the method
*/

public class ReturnValues {
   
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
    }   // Outputs 8 (5 + 3)
}
