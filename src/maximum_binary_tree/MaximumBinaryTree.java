package maximum_binary_tree;

/*
Input: [3,2,1,6,0,5]
Output: return the tree root node representing the following tree:

      6
    /   \
   3     5
    \    /
     2  0
       \
        1
 */

import utils.TreeNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return getTree(list);
    }

    private TreeNode getTree(List<Integer> list) {
        if (list != null && list.size() != 0) {
            int index = IntStream.range(0, list.size()).boxed()
                    .max(Comparator.comparing(list::get)).orElse(-1);
            TreeNode treeNode = new TreeNode(list.get(index));
            treeNode.setLeft(getTree(list.subList(0, index)));
            treeNode.setRight(getTree(list.subList(index + 1, list.size())));
            return treeNode;
        }
        return null;
    }
}
