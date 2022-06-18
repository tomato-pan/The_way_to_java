package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet();
        for (String email : emails) {
            String name = email.split("@")[0].replaceAll("\\.", "");
            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));
            }
            String address = email.split("@")[1];
            emailSet.add(name +"@"+ address);
        }
        return emailSet.size();
    }
    public void duplicateZeros(int[] A) {
        int n = A.length, cnt0 = 0;
        // 先统计零的总数
        for (int i = 0; i < n; ++i) if (A[i] == 0) ++cnt0;
        for (int i = n - 1; i >= 0; --i) {
            // 碰到零就减去，剩余的就是左边零的个数
            if (A[i] == 0) --cnt0;
            // A[i] 向右移动 cnt0 位
            if (i + cnt0 < n) {
                A[i + cnt0] = A[i];
                // 如果 A[i] 是零，移动完之后，后面还要补个零
                if (A[i] == 0 && i + cnt0 + 1 < n) {
                    A[i + cnt0 + 1] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails = {"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"};
        Solution929 a = new Solution929();
        System.out.println(a.numUniqueEmails(emails));

    }
}