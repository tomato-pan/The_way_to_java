package java_006;

import java.util.HashMap;

public class HashMapdemo1 {
    public static void main(String[] args) {

    }
    public int [] twoSum(int [] nums, int target){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < n; i++) {
            int other = target - nums[i];
            if (map.containsKey(other) && map.get(other) != i){
                return new int[]{i,map.get(other)};
            }
        }
        return new int[]{-1,-1};
    }
}
