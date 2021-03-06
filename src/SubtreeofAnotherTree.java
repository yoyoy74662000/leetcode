/**
 *  Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

 Example 1:
 Given tree s:

        3
       / \
      4   5
     / \
    1   2

 Given tree t:

        4
       / \
      1   2

 Return true, because t has the same structure and node values with a subtree of s.

 Example 2:
 Given tree s:

        3
       / \
      4   5
     / \
    1   2
   /
  0

 Given tree t:

    4
   / \
  1   2

 Return false.
 *
 */


// time : O(n)
// space : O(n)

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String spreorder = generatepreorderString(s);
        String tpreorder = generatepreorderString(t);

        return spreorder.contains(tpreorder) ;
    }
    public String generatepreorderString(TreeNode s){
        StringBuilder sb = new StringBuilder();
        Stack<TreeNode> stacktree = new Stack();
        stacktree.push(s);
        while(!stacktree.isEmpty()){
            TreeNode popelem = stacktree.pop();
            if(popelem==null)
                sb.append(",#"); // Appending # inorder to handle same values but not subtree cases
                                 //,12,#,#
                                  //,2,#,#
            else
                sb.append(","+popelem.val);
            if(popelem!=null){
                stacktree.push(popelem.right);
                stacktree.push(popelem.left);
            }
        }
        return sb.toString();
    }
}
