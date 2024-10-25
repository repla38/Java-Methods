package JavaMethods.MethodParameters;

public class Parameters {
    


    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age + " years old.");
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        if (age < 18) { // If age is less than 18, print "access denied"
            System.out.println("Access denied - You are not old enough!");
        } else { // If age is greater than, or equal to, 18, print "access granted"
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);    // Liam is 5 years old
        myMethod("Jenny", 8);   // Jenny is 8 years old
        myMethod("Anja", 31);   // Anja is 31 years old

        checkAge(20); // Outputs "Access granted - You are old enough!"
    }
}
