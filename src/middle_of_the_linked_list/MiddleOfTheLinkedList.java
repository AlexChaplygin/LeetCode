package middle_of_the_linked_list;

import utils.ListNode;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int countSingle = 0;
        ListNode temp = head;
        ListNode middle = head;

        while (temp != null) {
            countSingle++;
            if (countSingle % 2 == 0) {
                middle = middle.getNext();
            }
            temp = temp.getNext();
        }

        return middle;
    }
}
