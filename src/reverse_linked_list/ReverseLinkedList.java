package reverse_linked_list;

import utils.ListNode;

/*
 Reverse a singly linked list.

Hint:
A linked list can be reversed either iteratively or recursively
*/

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode previous = null;

        ListNode current = head;

        while(current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        return previous;
    }

}
