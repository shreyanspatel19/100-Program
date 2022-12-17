import java.util.Scanner;
 class P84{

    public class TreeNode {
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

  public static void main(String[] age){
    TreeNode tree = new TreeNode();
    tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
            tree.left.left = new Node(4);
            //     1
            //    / \
            //   2   3
            //  / \ / \
            // 4 null null null
  }
  public TreeNode invertTree(TreeNode root) {
        if(root == null)
           return null;
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }
}