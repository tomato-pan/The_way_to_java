public class Truncate {
    public String truncateSentence(String s, int k) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k) {
                index = i;
                break;
            }
        }
        if (count < k) {
            return s;
        }
        return s.substring(0, index);

    }

    public static void main(String[] args) {
        Truncate tr = new Truncate();
        System.out.println(tr.truncateSentence("Hello how are you Contestant", 6));
    }
}
