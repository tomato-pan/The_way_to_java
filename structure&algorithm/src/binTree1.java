class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class binTree1 {
    public int count(TreeNode root) {
        if (root == null) return 0;
        return 1 + count(root.left) + count(root.right);
    }
    // 前序打印
    public void preOrder(TreeNode root) {
        if (root == null) return ;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    //翻转二叉树 镜像二叉树
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        //交换节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 让左右子节点继续翻转它们的子节点
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        binTree1 a1 = new binTree1();
        System.out.println(a1.count(t1));
        System.out.println(a1.invertTree(t1));
        a1.preOrder(t1);
        a1.preOrder(a1.invertTree(t1));
    }
}
