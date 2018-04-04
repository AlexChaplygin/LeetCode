package utils;

import java.util.ArrayList;
import java.util.List;

/*
* Class with helpful methods for trees.
*/

public class TreeNodeUtils {

    /**
     * Add value to the tree
     * @param val - new value
     * @param headNode - head of tree
     */
    public void addTreeNode(int val, TreeNode headNode) {

        if(val < headNode.getVal()) {

            if(headNode.getLeft() == null) {
                headNode.setLeft(new TreeNode(val));
            } else {
                addTreeNode(val, headNode.getLeft());
            }

        } else {

            if(headNode.getRight() == null) {
                headNode.setRight(new TreeNode(val));
            } else {
                addTreeNode(val, headNode.getRight());
            }

        }

    }

    /**
     * Find node to delete with parent.
     * @param value
     * @param treeNode
     * @return treeNodes[0] - value, treeNodes[1] - parent
     */
    public TreeNode[] findTreeNodeWithParent(int value, TreeNode treeNode) {

        TreeNode temp = treeNode;

        TreeNode[] treeNodes = new TreeNode[2];

        TreeNode parent = null;

        while(temp != null) {

            if(value > temp.getVal()) {
                parent = temp;
                temp = temp.getRight();
            } else if(value < temp.getVal()) {
                parent = temp;
                temp = temp.getLeft();
            } else {
                break;
            }
        }

        treeNodes[0] = temp;
        treeNodes[1] = parent;

        return treeNodes;
    }

}
