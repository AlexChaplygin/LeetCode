package invert_binary_tree;

import org.junit.Assert;
import org.junit.Test;
import utils.TreeNode;

public class InvertBinaryTreeTest {

    private String treeResultString = "";

    @Test
    public void invertTreeTest() {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode9 = new TreeNode(9);

        treeNode4.setLeft(treeNode2);
        treeNode4.setRight(treeNode7);
        treeNode2.setLeft(treeNode1);
        treeNode2.setRight(treeNode3);
        treeNode7.setLeft(treeNode6);
        treeNode7.setRight(treeNode9);

        TreeNode root =invertBinaryTree.invertTree(treeNode4);
        checkTree(root);

        Assert.assertTrue(treeResultString.equals("4796231"));
    }

    private void checkTree(TreeNode treeNode) {

        if(treeNode == null)
            return;

        treeResultString += treeNode.getVal();

        checkTree(treeNode.getLeft());
        checkTree(treeNode.getRight());
    }

}
