package merge_two_binary_trees;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoBinaryTreesTest {

    private String treeResultString = "";

    @Test
    public void mergeTreesTest() {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.setLeft(treeNode3);
        treeNode1.setRight(treeNode2);

        treeNode3.setLeft(treeNode5);


        TreeNode _treeNode2 = new TreeNode(2);
        TreeNode _treeNode1 = new TreeNode(1);
        TreeNode _treeNode3 = new TreeNode(3);
        TreeNode _treeNode4 = new TreeNode(4);
        TreeNode _treeNode7 = new TreeNode(7);

        _treeNode2.setLeft(_treeNode1);
        _treeNode2.setRight(_treeNode3);
        _treeNode1.setRight(_treeNode4);
        _treeNode3.setRight(_treeNode7);

        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        TreeNode returnTree = mergeTwoBinaryTrees.mergeTrees(treeNode1, _treeNode2);
        checkTree(returnTree);

        Assert.assertTrue(treeResultString.equals("345457"));
    }

    private void checkTree(TreeNode treeNode) {

        if(treeNode == null)
            return;

        treeResultString += treeNode.getVal();

        checkTree(treeNode.getLeft());
        checkTree(treeNode.getRight());
    }
}
