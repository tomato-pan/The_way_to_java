package tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class findLeftNode {
    public static int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque();
        deque.addLast(root);
        int res = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            res = deque.peek().val;
            while (size!= 0) {
                TreeNode poll = deque.pollFirst();
                if (poll.left != null) deque.addLast(poll.left);
                if (poll.right != null) deque.addLast(poll.right);
            }
        }
        return res;
    }
}
