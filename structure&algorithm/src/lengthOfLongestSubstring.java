import java.util.HashMap;

public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0){return 0;}
        int max=0;
        int left = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring ll = new lengthOfLongestSubstring();
        System.out.println(ll.lengthOfLongestSubstring(s));
    }
}
