package Arrays;

public class LC1752CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums){
        int count = 1;
        int n = nums.length;

        for(int i = 0; i< 2*n;i++){
            if(nums[(i-1)%n] <= nums[i%n]){
                count++;
            }else {
                count = 1;
            }
            if(count == n){
                return true;
            }
        }
        return n == 1;
    }
}
