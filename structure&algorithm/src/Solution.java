import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] plusOne_66(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public int getMoneyAmount(int n) {
        int[][] f = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                int minCost = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = k + Math.max(f[i][k - 1], f[k + 1][j]);
                    minCost = Math.min(minCost, cost);
                }
                f[i][j] = minCost;
            }
        }
        return f[1][n];
    }



    public boolean searchMatrix1(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                --y;
            } else {
                ++x;
            }
        }
        return false;
    }

    public String getHint(String secret, String guess) {
        int n = secret.length();
        int a = 0, b = 0;
        int[] cnt1 = new int[10], cnt2 = new int[10];
        for (int i = 0; i < n; i++) {
            int c1 = secret.charAt(i) - '0', c2= guess.charAt(i) - '0';
            if (c1 == c2) {
                a++;
            } else {
                cnt1[c1]++;
                cnt2[c2]++;
            }
        }
        for (int i = 0; i < 10; i++) b += Math.min(cnt1[i], cnt2[i]);
        return a + "A" + b + "B";


//        HashMap<Character, Integer> dic = new HashMap<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        int bulls = 0;
//        int cows = 0;
//        for (int i = 0; i < secret.length(); i++) {
//            if (dic.containsKey(secret.charAt(i))) {
//                dic.put(secret.charAt(i), dic.get(secret.charAt(i)) + 1);
//            } else {
//                dic.put(secret.charAt(i), dic.getOrDefault(secret.charAt(i), 1));
//            }
//        }
//        for (int k = 0; k < secret.length(); k++) {
//            if (secret.charAt(k) == guess.charAt(k)) {
//                dic.put(guess.charAt(k), dic.get(guess.charAt(k)) - 1);
//                bulls++;
//            } else {
//                list.add(k);
//            }
//        }
//        for (int j : list) {
//            if (dic.containsKey(guess.charAt(j)) && dic.get(guess.charAt(j)) > 0) {
//                dic.put(guess.charAt(j), dic.get(guess.charAt(j)) - 1);
//                cows++;
//            }
//        }
//        String res =String.format("%dA%dB",bulls,cows);
//        return res;
    }
    public int findNthDigit(int n) {
        int len = 1;
        while (len * 9 * Math.pow(10, len - 1) < n) {
            n -= len * 9 * Math.pow(10, len - 1);
            len++;
        }
        long s = (long) Math.pow(10, len - 1);
        long x = n / len - 1 + s;
        n -= (x - s + 1) * len;
        return n == 0 ? (int) (x % 10) : (int) ((x + 1) / (int) (Math.pow(10, len - n)) % 10);
    }

    public static void main(String[] args) {
        Solution ss = new Solution();
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 0, 9};
        System.out.println(ss.plusOne_66(digits));
        System.out.println(ss.getHint("1807", "7810"));
    }
}
