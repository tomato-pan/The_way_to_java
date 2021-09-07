import java.util.Arrays;

public class squaresArray {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
    public int[] sortedSquares2(int[] nums) {
        int n = nums.length;
        int ans = new int[n];
        for (int i = 0; i<n;i++){
            if (nums[i]<0){

            }
        }
    }
}
