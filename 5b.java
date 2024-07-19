class Solution {
    public TreeNode bstToGst(TreeNode root) {
        // Initialize sum as a class member to keep track of the accumulated sum
        int[] sum = new int[1];
        // Perform reverse in-order traversal
        reverseInOrderDFS(root, sum);
        return root;
    }

    private void reverseInOrderDFS(TreeNode node, int[] sum) {
        if (node == null) {
            return;
        }

        // Visit the right subtree first
        reverseInOrderDFS(node.right, sum);

        // Update the sum and the current node's value
        sum[0] += node.val;
        node.val = sum[0];

        // Visit the left subtree
        reverseInOrderDFS(node.left, sum);
    }
}
