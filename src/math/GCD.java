package math;

public class GCD {
    // Normal method to find GCD
    // Time Complexity: O(min(a,b))
    // Space Complexity: O(1)
    public static int normal_gcd(int a, int b){
        int gcd = 1;
        for (int i = 1;i <= Math.min(a,b);i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    // Euclidean method to find GCD
    // Time Complexity: O(log(min(a,b)))
    // Space Complexity: O(1)
    public static int euclidean_gcd(int a, int b){
        while (a > 0 && b > 0){
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }
        }
        if ( a == 0){
            return b;
        }
        return a;
    }
}
