
package recursion;

public class Recursion {
    // Summation of 5: 5+4+3+2+1
    // Summation of 7: 7+6+5+4+3+2+1
    
    public static int Summation(int n) {
        // Base Case
        if (n <= 0) { // we are at the end
            return 0;
        }
        // Recursive Case
        else { // call the function within the function!
            // 5 + Summation(4)
            // 5 + 4 + Summation(3)
            // 5 + 4 + 3 + Summation(2)
            // 5 + 4 + 3 + 2 + Summation(1)
            // 5 + 4 + 3 + 2 + 1 + Summation(0) -- Done, go to base case
            return n + Summation(n-1);
        }
        
    }
    
    // 5! --> 5 * 4 * 3 * 2 * 1 --> 5 * 4!
    // 4! -> 4 * 3 * 2 * 1 --> 4 * 3!
    
    public static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
        }
        // Recursive Case
        else {
            return n * Factorial(n-1);
        }
    }
    
    // Exponentiation
    // 5^3 = 5 * 5 * 5
    // int n = 5 -> number
    // int p = 3 -> power
    public static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) { // mult identity: 5^0 = 1
            return 1;
        }
        // Recursive case
        else {
            return n * Exponentiation(n, p-1);
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        
        System.out.println("Summation of " + n + ": " + Summation(n));
        
        System.out.println("Factorial of " + n + ": " + Factorial(n));
        
        System.out.println("Exponentiation of " + n + " to the power of " + p + ": " + Exponentiation(n, p));
        
        
        
        
    }
    
}
