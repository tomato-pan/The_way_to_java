import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LC187 {
    static final int L = 10;
    Map<Character, Integer> bin = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('C', 1);
        put('G', 2);
        put('T', 3);
    }};

    public List<String> findRepeatedDnaSequences1(String s) {
        List<String> ans = new ArrayList<String>();
        int n = s.length();
        if (n <= L) {
            return ans;
        }
        int x = 0;
        for (int i = 0; i < L - 1; ++i) {
            x = (x << 2) | bin.get(s.charAt(i));
        }
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int i = 0; i <= n - L; ++i) {
            x = ((x << 2) | bin.get(s.charAt(i + L - 1))) & ((1 << (L * 2)) - 1);
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            if (cnt.get(x) == 2) {
                ans.add(s.substring(i, i + L));
            }
        }
        return ans;
    }

    public List<String> findRepeatedDnaSequences(String s) {
        List <String> list =new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int L = 10;
        for (int i =0 ;i+L<=s.length();i++){
            String sub = s.substring(i,i+L);
            if (map.containsKey(sub)){
                map.put(sub,map.get(sub)+1);
            }
            else {
                map.put(sub,1);
            }
            if (map.get(sub)>1){
                if (!list.contains(sub))
                {list.add(sub);}
            }
        }
        return list;
    }

    public static void main(String[] args) {
        LC187 lc = new LC187();
//        List<String> list1 = lc.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        List<String> list1 = lc.findRepeatedDnaSequences("AAAAAAAAAAAAA");
        for (String i : list1){
            System.out.println(i);
        }
    }
}
