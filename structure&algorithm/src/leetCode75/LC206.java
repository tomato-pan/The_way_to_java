package leetCode75;

public class LC206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public static ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode cur = head;
            while (cur != null) {
                ListNode tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }

        public static void main(String[] args) {
            ListNode n1 = new ListNode(1);
            n1.next = new ListNode(2);
            n1.next.next = new ListNode(3);
            ListNode n2 = reverseList(n1);
            while (n2!=null){
                System.out.println(n2.val);
                n2=n2.next;
            }
        }
    }
}
