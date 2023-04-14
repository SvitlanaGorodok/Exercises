package trees;

/*
   4
  /\
10  23
    /\
  12  6

Задача: знайти глибину дерева.
*/

public class Exercise1 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4,
                new TreeNode(10),
                new TreeNode(23,
                        new TreeNode(12),
                        new TreeNode(6)));
        int result = maxTreeDepth(tree);
        System.out.println("Tree depth is " + result);
    }

    public static int maxTreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMaxDepth = maxTreeDepth(root.left);
        int rightMaxDepth = maxTreeDepth(root.right);
        return leftMaxDepth > rightMaxDepth ? leftMaxDepth + 1 : rightMaxDepth + 1;
    }
}
