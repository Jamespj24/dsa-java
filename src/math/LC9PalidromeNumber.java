package math;

public class LC9PalidromeNumber {
    // Function to check if a number is a palindrome
    // Time Complexity: O(d) where d is the number of digits in n
    // Space Complexity: O(1)
    public static boolean is_palindrome(int n){
        if(n < 0) return false; // Negative numbers are not palindromes
        int rev = 0;
        int original = n;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            rev = rev * 10 + digit;
        }
        return rev == original;
    }
}
