package Arrays;

public class LC283MoveZeroes {
    public static void moveZeroes(int[] nums){
        int i = 0;
        int n = nums.length;
        for(int j = 1; j<n;j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
    }
}
