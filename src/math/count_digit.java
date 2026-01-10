package math;

public class count_digit {
    // Function to count number of digits in a number
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    static int count_digit(int n){

        int cnt = 0;

        while(n > 0){
            int digit = n % 10;
            n /= 10;
            cnt ++;
        }
        return cnt;
    }
}