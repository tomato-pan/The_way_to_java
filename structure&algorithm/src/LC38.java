public class LC38 {
    public String countAndSay(int n) {
        String str = "1";
        for (int i = 2;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int start=0;
            int pos = 0;
            while (pos<str.length()){
                while (pos<str.length() && str.charAt(pos)==str.charAt(start)){
                    pos++;
                }
                sb.append(Integer.toString(pos-start)).append(str.charAt(start));
                start=pos;
            }
            str = sb.toString();
        }
        return str;
    }
    public String countAndSay1(int n) {
        if (n==1) return "1";
        String before = countAndSay1(n-1);
        StringBuilder res = new StringBuilder();
        char cur = before.charAt(0);
        int count = 1;
        for (int i = 1; i < before.length(); i++) {
            if (before.charAt(i) != cur) {
                res .append( Integer.toString(count) ).append(cur);
                cur = before.charAt(i);
                count = 0;
            }
            count ++;
        }
        res .append( Integer.toString(count) ).append(cur);
        return res.toString();
    }

    public static void main(String[] args) {
        int n=4;
        LC38 lc=new LC38();
        System.out.println(lc.countAndSay(4));
        System.out.println(lc.countAndSay1(4));
    }
}
