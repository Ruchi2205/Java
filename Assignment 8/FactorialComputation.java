public class FactorialComputation {
    public static void main(String[] args) 
    { 
        System.out.print("Factorial of the given no is: ");
        System.out.println(computeFactorial(5));
    }
    
    public static int computeFactorial(int n)
    {   
        if (n == 0)
        {
            return 1;
        }
        int smallOutput = computeFactorial(n - 1);
        int output = n * smallOutput;
        return output;
    }
}
