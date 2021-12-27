package tree;

import java.util.ArrayList;
import java.util.List;

public class inorder {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {return new ArrayList<Integer>();}
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

}
