public class arrangeCoins {
    public int arrangeCoins1(int n) {
        int line = 0;
        int k =1;
        while(n>=0){
            n=n-k;
            if (n<0) break;
            line++;
            k++;
        }
        return line;
    }
    public int arrangeCoins2(int n) { //数学公式
        return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
    }
    public int arrangeCoins3(int n) { //2分法
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        arrangeCoins ac = new arrangeCoins();
        System.out.println("line:"+ac.arrangeCoins1(6));
    }
}
