// java :七进制数
//给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
//
//
//
// 示例 1:
//
//
//输入: num = 100
//输出: "202"
//
//
// 示例 2:
//
//
//输入: num = -7
//输出: "-10"
//
//
//
//
// 提示：
//
//
// -10⁷ <= num <= 10⁷
//
// Related Topics 数学 👍 135 👎 0

package leetcode.editor.cn;

class P504Base7 {
    public static void main(String[] args) {
        Solution solution = new P504Base7().new Solution();
        // ToTest
        System.out.println(solution.convertToBase7(100));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            boolean flag = num < 0;
            if (flag) num = -num;
            StringBuilder sb = new StringBuilder();
            while (num != 0) {
                sb.append(num % 7);
                num /= 7;
            }
            return flag ? sb.append("-").reverse().toString() : sb.reverse().toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
