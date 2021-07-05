public class LC875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 100000000+1;
        while (left<right){
            int mid = left+(right-left)/2;
            if (f(piles,mid)==h){
                right=mid;
            }
            else if (f(piles,mid)<h){
                right=mid;
            }
            else if (f(piles,mid)>h) {
                left = mid + 1;
            }
        }
        return left;
    }
    public int f(int[] piles, int x) {
        int hours = 0;
        for (int pile :piles){
            hours+=pile/x;
            if (pile%x>0){ // 剩余大于1个的话就要在多花一小时
                hours++;
            }
        }
        return hours;
    }

    public static void main(String[] args) {
        int [] piles={30,11,23,4,20};
        int H = 5;
        LC875 aa = new LC875();
        System.out.println(aa.minEatingSpeed(piles,H));
    }
}

