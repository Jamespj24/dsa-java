package Arrays;

public class LC26RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int n = nums.length;
        for(int j = 1;j<n;j++){
            if(nums[i] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}
