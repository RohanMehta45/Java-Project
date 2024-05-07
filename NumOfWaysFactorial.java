import java.util.Scanner;

public class NumOfWaysFactorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        // Read the value of N (number of members)
        int N = scanner.nextInt();
        
        // Calculate the number of possible ways
        int ways = 2 *(N - 1) * factorial(N - 2);
        
        // Output the result
        System.out.println(ways);
    }
    
    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
