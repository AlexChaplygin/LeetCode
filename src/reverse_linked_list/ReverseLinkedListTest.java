package reverse_linked_list;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

public class ReverseLinkedListTest {

    @Test
    public void reverseListTest() {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode list = reverseLinkedList.reverseList(listNode1);

        Assert.assertTrue(getAllValues(list).equals("321"));

    }

    private String getAllValues(ListNode list) {

        String result = "";

        ListNode temp = list;
        while(temp != null) {
            result += temp.getVal();
            temp = temp.getNext();
        }

        return result;

    }

}
