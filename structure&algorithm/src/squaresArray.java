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
        int left = 0;
        int right = nums.length-1;
        int [] res = new int[nums.length];
        int write = nums.length-1;
        while (left<=right){
            if (nums[left]*nums[left]>nums[right]*nums[right]){
                res[write] = nums[left]*nums[left];
                left++;
                write--;
            }
            else{
                res[write] = nums[right]*nums[right];
                right--;
                write--;
            }
        }
        return res;
    }
}
