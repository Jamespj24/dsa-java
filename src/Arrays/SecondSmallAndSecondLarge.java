package Arrays;

public class SecondSmallAndSecondLarge {
    public static void main(String[] args) {
        int[] arr = {8,7,2,1,4,3,4};
        getElements(arr);
    }
    public static void getElements(int[] arr){
        int n = arr.length;
        if(n == 0 || n == 1){
            return;
        }
        int large = Integer.MIN_VALUE,secondLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE,secondSmall = Integer.MAX_VALUE;

        for (int i = 0;i <n;i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large,arr[i]);
        }
        for (int j : arr) {
            if (j < secondSmall && j != small) {
                secondSmall = j;
            }
            if(j > secondLarge && j != large){
                secondLarge = j;
            }
        }
        System.out.println(secondSmall);
        System.out.println(secondLarge);
    }
}
