package leetCode75;

public class LC724_day1 {
    public static int pivotIndex(int[] nums) {
        int sums = 0, left = 0;
        for (int num : nums) {
            sums += num;
        }
        for (int j = 0; j < nums.length; j++) {
            if (left * 2 == sums - nums[j]) {
                return j;
            } //先判断，再累加，判段下一个索引值
            left += nums[j];
        }
        return -1;
    }

}
