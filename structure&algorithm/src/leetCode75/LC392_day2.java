package leetCode75;

public class LC392_day2 {
    public static boolean isSubsequence(String s, String t) {
        //根据测试案例
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        //跳出循环则不匹配，不必进行下一步直接返回false
        while (j < t.length()) {
            char c = s.charAt(i);
            char c1 = t.charAt(j);
            if (c == c1) {
                i++;
                if (i == s.length()) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
