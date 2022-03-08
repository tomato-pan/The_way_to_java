// java :蜡烛之间的盘子
//给你一个长桌子，桌子上盘子和蜡烛排成一列。给你一个下标从 0 开始的字符串 s ，它只包含字符 '*' 和 '|' ，其中 '*' 表示一个 盘子 ，'|
//' 表示一支 蜡烛 。
//
// 同时给你一个下标从 0 开始的二维整数数组 queries ，其中 queries[i] = [lefti, righti] 表示 子字符串 s[
//lefti...righti] （包含左右端点的字符）。对于每个查询，你需要找到 子字符串中 在 两支蜡烛之间 的盘子的 数目 。如果一个盘子在 子字符串中 左边和右边
// 都 至少有一支蜡烛，那么这个盘子满足在 两支蜡烛之间 。
//
//
// 比方说，s = "||**||**|*" ，查询 [3, 8] ，表示的是子字符串 "*||**|" 。子字符串中在两支蜡烛之间的盘子数目为 2 ，子字符
//串中右边两个盘子在它们左边和右边 都 至少有一支蜡烛。
//
//
// 请你返回一个整数数组 answer ，其中 answer[i] 是第 i 个查询的答案。
//
//
//
// 示例 1:
//
//
//
// 输入：s = "**|**|***|", queries = [[2,5],[5,9]]
//输出：[2,3]
//解释：
//- queries[0] 有两个盘子在蜡烛之间。
//- queries[1] 有三个盘子在蜡烛之间。
//
//
// 示例 2:
//
//
//
// 输入：s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16
//]]
//输出：[9,0,0,0,0]
//解释：
//- queries[0] 有 9 个盘子在蜡烛之间。
//- 另一个查询没有盘子在蜡烛之间。
//
//
//
//
// 提示：
//
//
// 3 <= s.length <= 10⁵
// s 只包含字符 '*' 和 '|' 。
// 1 <= queries.length <= 10⁵
// queries[i].length == 2
// 0 <= lefti <= righti < s.length
//
// Related Topics 数组 字符串 二分查找 前缀和 👍 51 👎 0

package leetcode.editor.cn;

class P2055PlatesBetweenCandles {
    public static void main(String[] args) {
        Solution solution = new P2055PlatesBetweenCandles().new Solution();
        // ToTest
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] platesBetweenCandles(String s, int[][] queries) {
            int n = s.length();
            int candle = -1;
            int num = 0;

            char[] arr = s.toCharArray();
            // 记录当前位置之前最近的一个蜡烛位置
            int[] preCandles = new int[n];
            // 记录当前位置之后最近的一个蜡烛位置
            int[] afterCandles = new int[n];
            // 记录直到当前位置已经有的蜡烛数量
            int[] preNums = new int[n];

            // 正这来一遍，统计preCandles与preNums
            for (int i = 0; i < n; i++) {
                if (arr[i] == '|') {
                    candle = i;
                    num++;
                }
                preCandles[i] = candle;
                preNums[i] = num;
            }

            candle = -1;
            // 反过来遍历一次，统计afterCandles
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] == '|') {
                    candle = i;
                }
                afterCandles[i] = candle;
            }

            int m = queries.length;
            int[] ans = new int[m];
            // 遍历每个区间
            for (int i = 0; i < m; i++) {
                // 找到分别离区间最近的两个蜡烛
                int l = afterCandles[queries[i][0]];
                int r = preCandles[queries[i][1]];
                // 只有一根蜡烛或者没有蜡烛，返回0
                if (l == -1 || r == -1 || l >= r) {
                    ans[i] = 0;
                } else {
                    // 两个蜡烛之间的所有种类的数量，减去蜡烛的部分
                    ans[i] = r - l - (preNums[r] - preNums[l]);
                }
            }
            return ans;



    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
