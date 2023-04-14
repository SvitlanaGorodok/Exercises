package trees;

/*
    1
   / \
  2   2
 /\   /\
3  4 4  3

Задача: перевірити чи дерево є симетричним.
 */

public class Exercise2 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)));
        System.out.println("isSymetric? - " + isSymmetric(tree));
    }
    static boolean isSymmetric(TreeNode root){
        if (root == null){
            return true;
        }
        return isSymmetricInternal(root.left,root.right);
    }

    static boolean isSymmetricInternal(TreeNode tn1, TreeNode tn2){
        //if both elements null -> true
        if (tn1 == null  && tn2 == null){
            return true;
        }

        //if first is null, second not null -> false
        if (tn1 == null || tn2 == null){
            return false;
        }

        //if both elements not null
        return (tn1.val == tn2.val)
                && isSymmetricInternal(tn1.left, tn2.right)
                && isSymmetricInternal(tn1.right, tn2.left);
    }

}
