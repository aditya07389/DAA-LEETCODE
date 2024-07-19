class Solution {
    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int deepestSum = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            deepestSum = 0; // Reset sum at the start of each level

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                deepestSum += currentNode.val;

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
        }

        return deepestSum;
    }
}
