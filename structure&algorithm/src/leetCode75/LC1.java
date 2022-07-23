package leetCode75;

import java.util.*;

public class LC1 {
    public static int[] twoSum(int[] nums, int target) {
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int s = target-nums[i];
            if (map.containsKey(s)){
                return new int[]{(int) map.get(s), i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] list = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(list, 9)));
    }
}
