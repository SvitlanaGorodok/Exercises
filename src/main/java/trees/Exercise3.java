package trees;
/*
     9
    / \
  3   14
 /\    / \
1  5  11  15
     / \
   10  12
 */
//Задача: написати метод для виводу дерева
public class Exercise3 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(9,
                        new TreeNode(3,
                                new TreeNode(1),
                                new TreeNode(5)),
                        new TreeNode(14,
                                new TreeNode(11,
                                        new TreeNode(10),
                                        new TreeNode(12)),
                                new TreeNode(15)));
        System.out.println(printTree(tree));
        //1, 3, 5, 9, 10, 11, 12, 14 ,15
    }
    static String printTree(TreeNode root){
        if(root == null){
            return "";
        } else {
            return printTree(root.left) + root.val + " " + printTree(root.right);
        }
    }


}
