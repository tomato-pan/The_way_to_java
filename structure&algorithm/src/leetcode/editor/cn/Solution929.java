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

    public static void main(String[] args) {
//        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails = {"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"};
        Solution929 a = new Solution929();
        System.out.println(a.numUniqueEmails(emails));

    }
}