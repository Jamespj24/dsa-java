package math;

public class PrimeNumber {
    // Check if a number is prime
    // Time complexity: O(sqrt(n))
    // Space complexity: O(1)
    public static boolean isPrime(int n){
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i ++){
            if (n % i == 0) { // i is a divisor
                cnt++;

                if (n / i != i) { // n / i is a different divisor
                    cnt++;
                }
            }
        }
        return cnt == 2; // A prime number has exactly two distinct positive divisors: 1 and itself
    }
}
