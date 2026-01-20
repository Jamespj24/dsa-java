package Arrays;

import java.util.Arrays;

public class LC189RotateArray {
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        int[] new_arr = new int[n];
        if(n <= k){
            return;
        }

        for(int i = 0;i<n;i++){
            new_arr[(i+k)%n] = nums[i];
        }
        System.arraycopy(new_arr,0,nums,0,new_arr.length);
    }
}
