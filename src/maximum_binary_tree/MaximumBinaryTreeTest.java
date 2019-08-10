package maximum_binary_tree;

import org.junit.Test;
import utils.TreeNode;

public class MaximumBinaryTreeTest {

    @Test
    public void maximumBinaryTreeTest() {
        MaximumBinaryTree maximumBinaryTree = new MaximumBinaryTree();
        TreeNode treeNode = maximumBinaryTree.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        System.out.println();
    }
}
