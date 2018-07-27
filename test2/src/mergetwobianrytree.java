public class mergetwobianrytree {
    public static void main(String[] args) {

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(3);

        n1.left = n2;
        n1.right = n3;
        n4.left = n5;
        n4.right = n6;
        TreeNode t1 = n2;
        TreeNode t2 = n5;

        System.out.println(mergeTrees(t1, t2).val);

    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;

        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
        }
    }
}
