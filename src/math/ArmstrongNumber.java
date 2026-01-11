package math;

public class ArmstrongNumber {
    // Function to count number of digits in a number
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    public static int cnt_digits(int n){
        int cnt = 0;
        while(n > 0){
            n /= 10;
            cnt++;
        }
        return cnt;
    }
    // Function to check if a number is an Armstrong number
    // Time Complexity: O(digits * log n)
    // Space Complexity: O(1)
    public static boolean isArmstrongNumber(int n){
        int digits = cnt_digits(n);
        int og = n;
        int sum = 0;
        while (n > 0){
            int ld = n % 10;
            n /= 10;
            sum += (int) Math.pow(ld,digits);
        }
        return sum == og;
    }

}
