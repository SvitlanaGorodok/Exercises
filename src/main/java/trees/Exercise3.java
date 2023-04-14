package trees;
/*
     4
    /\
  3  10
 /    /\
1   6  12
   /\
  5  7
 */
//Задача: написати метод для виводу дерева
public class Exercise3 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4,
                        new TreeNode(3,
                                new TreeNode(1),
                                null),
                        new TreeNode(10,
                                new TreeNode(6,
                                        new TreeNode(5),
                                        new TreeNode(7)),
                                new TreeNode(12)));
        System.out.println(printTree(tree));
        //3, 4, 5, 6, 7, 10, 12
    }
    static String printTree(TreeNode root){
        if(root == null){
            return "";
        } else {
            return printTree(root.left)  + " " +  root.val;
        }
    }


}
