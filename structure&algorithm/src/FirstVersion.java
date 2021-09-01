public class FirstVersion {


    public int firstBadVersion(int n) {
        //类似二分法
        int left =0;
        int right = n;
        while (left<right){
            int mid =left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        return left;
    }

    private boolean isBadVersion(int version) {
        return true;
    }
}
