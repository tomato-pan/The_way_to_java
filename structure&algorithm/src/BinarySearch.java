public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            System.out.println(mid);
            System.out.println(nums[mid]);
            if (target==nums[mid]){return mid;}
            else if (target>nums[mid]){
                left = mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
    public int find(int[] nums, int target,boolean lower) {
        int left = 0;
        int right = nums.length-1,ans = nums.length;
        while (left<=right){
            int mid = (left+right)>>1;
            if (nums[mid]>target || (lower&&nums[mid]>=target)){
                right=mid-1;
                ans = mid;
            }
            else{left=mid+1;}
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
            int leftIdx = find(nums,target,true);
            int rightIdx = find(nums,target,false)-1;
            if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
                return new int[]{leftIdx, rightIdx};
            }
            return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] nums = {5};
        int [] nums2 = {5,7,7,8,8,10};
        int target = 8;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(nums,target));
        int[] aa =bs.searchRange(nums2,target);
        for (int a:aa){
            System.out.println(a);
        }
    }
}
