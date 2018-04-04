package invert_binary_tree;

import utils.TreeNode;

/*
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to

     4
   /   \
  7     2
 / \   / \
9   6 3   1
Trivia:
This problem was inspired by this original tweet by Max Howell:

Google: 90% of our engineers use the software you wrote (Homebrew),
but you can’t invert a binary tree on a whiteboard so f*** off.
*/

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode swap = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(swap);

        invertTree(root.getLeft());
        invertTree(root.getRight());

        return root;
    }

}
