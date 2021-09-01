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

    public static void main(String[] args) {
        int [] nums = {5};
        int target = 5;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(nums,target));
    }
}
