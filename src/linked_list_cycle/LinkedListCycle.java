package linked_list_cycle;

import utils.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode temp = head;

        int val = -666;

        while(temp != null) {
            if(val == temp.getVal())
                return true;

            temp.setVal(-666);
            temp = temp.getNext();
        }

        return false;

    }

    /*
    OR
    Set<ListNode> nodesSeen = new HashSet<>();
    while (head != null) {
        if (nodesSeen.contains(head)) {
            return true;
        } else {
            nodesSeen.add(head);
        }
        head = head.next;
    }
    return false;
    */

}
