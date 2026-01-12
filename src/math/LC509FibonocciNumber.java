package math;

public class LC509FibonocciNumber {
    //Time Complexity: O(n)+O(n), for calculating and printing the Fibonacci series.
    //Space Complexity: O(n) for storing the fibonacci series.
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        int last = fib(n -1);
        int slast = fib(n - 2);

        return last + slast;

    }
}
