public class LC58 {
    public int lengthOfLastWord(String s) {
        int count =0;
        boolean flag =false;
        char [] strc= s.toCharArray();
        for (int i = strc.length-1;i>=0;i--){
            if (strc[i]!=' '){
                flag=true;
                count++;
            }
            else {
                if (flag==true){return count;}
            }
        }
        return count;
    }
    public int lengthOfLastWord1(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello ";
        String s3 = " World";
        String s4 = " ";
        LC58 s = new LC58();
        System.out.println(s.lengthOfLastWord(s1));
        System.out.println(s.lengthOfLastWord1(s1));
        System.out.println(s.lengthOfLastWord(s2));
        System.out.println(s.lengthOfLastWord1(s2));
        System.out.println(s.lengthOfLastWord(s3));
        System.out.println(s.lengthOfLastWord1(s3));
        System.out.println(s.lengthOfLastWord(s4));
        System.out.println(s.lengthOfLastWord1(s4));
    }
}
