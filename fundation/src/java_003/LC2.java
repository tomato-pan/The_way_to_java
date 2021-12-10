package java_003;

public class ListNode {
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

    public class LC2 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans = new ListNode();
            while (!l1.next || !l2.next) {
                System.out.println(l1.val + l2.val);
                System.out.println(l1.val);
                System.out.println(l2.val);
            }
            return ans;
        }

        public static void main(String[] args) {
            LC2 lc2 = new LC2();
            ListNode l1 = new ListNode(9);
            ListNode l2= new ListNode(9);
            l1.next=ListNode(9);
            l1.next=ListNode(9);
            l1.next=ListNode(9);
            l1.next=ListNode(9);
            l2.next=ListNode(9);
            l2.next=ListNode(9);
            l2.next=ListNode(9);
            l2.next=ListNode(9);
            lc2.addTwoNumbers(l1,l2);
        }
    }

}
