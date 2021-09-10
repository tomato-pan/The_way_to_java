public class reverseString {
    public static void reverseString(char[] s) {
        int left=0;
        int right = s.length-1;
        while (left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
        String ss = "Let's take LeetCode contest";
        System.out.println(reverseWords(ss));
    }
    public static String reverseWords(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                reverse(array, start, i - 1);
                start = i + 1; // 更新start为下一个单词的左索引
                continue;
            }
            if (i == array.length - 1) {
                reverse(array, start, i);
            }
        }
        return new String(array);
    }
    private static void reverse(char[] array, int l, int r) {
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l += 1;
            r -= 1;
        }
    }

}
