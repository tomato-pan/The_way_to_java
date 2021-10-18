public class LC476 {
    public int findComplement(int num) {
        String sb = Integer.toBinaryString(num);
        StringBuilder sb1 = new StringBuilder("");
        for (int i = 0 ;i<sb.length();i++) {
            if (sb.charAt(i)=='0'){
                sb1.append("1");
            }
            else{
                sb1.append("0");
            }
        }
        return Integer.parseInt(sb1.toString(),2);
    }

    public static void main(String[] args) {
        int num = 5;
        LC476 lc = new LC476();
        System.out.println(lc.findComplement(5));
    }
}
