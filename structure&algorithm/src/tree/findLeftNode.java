package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class findLeftNode {
    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null) queue.offer(root.right);
            if (root.left != null) queue.offer(root.left);
        }
        return root.val;
    }
}
