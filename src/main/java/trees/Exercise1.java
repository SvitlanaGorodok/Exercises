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
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(10);
        TreeNode nextNode = new TreeNode(23);
        treeNode.right = nextNode;
        nextNode.left = new TreeNode(12);
        nextNode.right = new TreeNode(6);
        int result = maxTreeDepth(treeNode);
        System.out.println(result);
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
