package terge_two_sorted_lists;

import utils.ListNode;

/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null && l2 == null) {
            return null;
        }

        ListNode listNode = new ListNode(-1);

        if(l1 == null) { // if remain only l2
            listNode.setVal(l2.getVal());
            listNode.setNext(mergeTwoLists(null, l2.getNext()));
        }else if(l2 == null) { // if remain only l1
            listNode.setVal(l1.getVal());
            listNode.setNext(mergeTwoLists(l1.getNext(), null));
        } else {
            if (l1.getVal() > l2.getVal()) {
                listNode.setVal(l2.getVal());
                listNode.setNext(mergeTwoLists(l1, l2.getNext()));
            } else {
                listNode.setVal(l1.getVal());
                listNode.setNext(mergeTwoLists(l1.getNext(), l2));
            }
        }

        return listNode;
    }

}
