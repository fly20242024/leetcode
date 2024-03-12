package everyday.four.march;

import java.util.HashSet;

/**
 * dfs 加 hash 题
 * 时间：O(N)
 * 空间：O(N)
 * fly  2024/3/12
 */
public class LC1261 {

}
class FindElements {

    HashSet<Integer> set;
    public FindElements(TreeNode root) {

        set = new HashSet<>();
        root.val = 0;
        dfs(root);

    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void dfs(TreeNode node){
        this.set.add(node.val);
        if(node.left != null){
            node.left.val = node.val * 2 +1;
            dfs(node.left);
        }
        if(node.right != null){
            node.right.val = node.val * 2 + 2;
            dfs(node.right);
        }
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}