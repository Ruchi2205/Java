public class OperatorDemo {
    public static void main(String[] args) {
        int x = 20, y = 8, z;
        boolean p = false, q = true;
        
        // Arithmetic operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition of x and y is: " + (x + y));
        System.out.println("Subtraction of x and y is: " + (x - y));
        System.out.println("Multiplication of x and y is: " + (x * y));
        System.out.println("Division of x and y is: " + (x / y));
        System.out.println("Modulus of x and y is: " + (x % y));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x <= y: " + (x <= y));

        // Logical operators
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));

        // Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("x << y: " + (x << y));
        System.out.println("x >> y: " + (x >> y));
        System.out.println("x >>> y: " + (x >>> y));

        // Assignment operators
        System.out.println("\nAssignment Operators:");
        z = x;
        System.out.println("z = x : " + z);
        z += y;
        System.out.println("z += y : " + z);
        z -= y;
        System.out.println("z -= y : " + z);
        z *= y;
        System.out.println("z *= y : " + z);
        z /= y;
        System.out.println("z /= y : " + z);
        z %= y;
        System.out.println("z %= y : " + z);
        
        // Conditional/Ternary Operator
        int minValue = (x < y) ? x : y;
        System.out.println("Minimum value: " + minValue);
    }
}
