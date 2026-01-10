package math;

public class ReverseInteger {
    // Function to reverse an integer
    // Time Complexity: O(d) where d is the number of digits in n
    // Space Complexity: O(1)
    public static int  reverse_integer(int n ){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}
