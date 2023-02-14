import java.util.Scanner;
 class P84{

    public static class TreeNode {
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
    tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
            tree.left.left = new TreeNode(4);
            invertTree(tree);
            //     1
            //    / \
            //   2   3
            //  / \ / \
            // 4 null null null
  }
  public  static TreeNode invertTree(TreeNode root) {
        if(root == null)
           return null;
        System.out.println(root.val);
        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }
}