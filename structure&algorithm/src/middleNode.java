public class middleNode {
    public static ListNode middleNode(ListNode head) {
        ListNode count = head;
        while (count != null && count.next!= null){
            head=head.next;
            count=count.next.next;

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);
        ListNode ln5 = new ListNode(5);
        ln1.next=ln2;
        ln1.next.next=ln3;
        ln1.next.next.next=ln4;
        ln1.next.next.next.next=ln5;
        ListNode l1 = middleNode(ln1);
        while (l1!=null){
        System.out.println(l1.val);
        l1=l1.next;
        }
    }
}

