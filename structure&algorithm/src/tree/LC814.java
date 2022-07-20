package tree;

public class LC814 {
    public static TreeNode pruneTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left == null && root.right == null && root.val == 0) {
            return null;
        }
        return root;
    }
    public static void preOrder(TreeNode root){
        if (root==null){
            System.out.println("null");
            return ;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode res = pruneTree(root);
        preOrder(res);

    }
}
