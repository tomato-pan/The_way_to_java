package tree;

import java.util.ArrayList;
import java.util.List;

public class inorder {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t4 = null;
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        inorder abc = new inorder();
        System.out.println(abc.maxDepth(t1));
        System.out.println(abc.maxDepth(t4));
    }
}
