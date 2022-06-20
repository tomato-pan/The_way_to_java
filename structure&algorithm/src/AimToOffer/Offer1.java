package AimToOffer;

import java.util.HashMap;

public class Offer1 {
    public int findRepeatNumber(int[] nums) {
        HashMap hasKey = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hasKey.get(nums[i]) != null) {
                return nums[i];
            }
            hasKey.put(nums[i], i);
        }
        return -1;
    }
}
