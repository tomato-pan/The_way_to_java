import java.util.Arrays;

public class checkInclusion {
    public boolean checkInclusion(String s1, String s2) {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1) return false;
        int[] counter1 = new int[26];
        int[] counter2 = new int[26];
        int left = 0;
        int right = left + n1 - 1;
        for (int i = 0; i < n1; i++) {
            System.out.println(ss1[i]);
            counter1[ss1[i]-'a']++; // A码下的对应字母
        }
        for (int i = 0; i < n1-1; i++) {
            counter2[ss2[i]-'a']++;
        }
        int k = 0;
        while (right<n2){
            System.out.println("ss2:"+ss2[k]);
            counter2[ss2[right]-'a']++;
            if (Arrays.equals(counter1,counter2))return true;
            else {
                counter2[ss2[left]-'a']++;
                if (counter2[ss2[left]-'a']<0){
                    counter2[ss2[left]-'a']=0;
                }
                left++;
                right++;
            }
            k++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        checkInclusion si = new checkInclusion();
        System.out.println(si.checkInclusion(s1,s2));
    }
}
