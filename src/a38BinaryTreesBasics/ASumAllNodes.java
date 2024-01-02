package a38BinaryTreesBasics;

class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class ASumAllNodes {
    TreeNode root;

    public ASumAllNodes() {
        root = null;
    }

    // Function to calculate the sum of all nodes in the binary tree
    public int sumAllNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return node.data + sumAllNodes(node.left) + sumAllNodes(node.right);
    }

    public static void main(String[] args) {
        ASumAllNodes tree = new ASumAllNodes();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        int sum = tree.sumAllNodes(tree.root);
        System.out.println("Sum of all nodes in the binary tree: " + sum);
    }
}
