package schooloj.分治最大二叉树;

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    public TreeNode construct(int[] nums, int left, int right) {//[left,right]
        if (left > right) {//递归终止条件
            return null;
        }
        int best = left;//最大值的下标
        for (int i = left + 1; i <= right; ++i) {//找到最大值的下标
            if (nums[i] > nums[best]) {//找到最大值的下标
                best = i;
            }
        }
        TreeNode node = new TreeNode(nums[best]);//创建根节点
        node.left = construct(nums, left, best - 1);//递归构造左子树
        node.right = construct(nums, best + 1, right);//递归构造右子树
        return node;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



