package middle_of_the_linked_list;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

public class MiddleOfTheLinkedListTest {

    @Test
    public void middleNodeTest() {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);
        listNode4.setNext(listNode5);
        ListNode result = middleOfTheLinkedList.middleNode(listNode1);

        Assert.assertEquals(3, result.getVal());

        ListNode listNode6 = new ListNode(6);
        listNode5.setNext(listNode6);

        result = middleOfTheLinkedList.middleNode(listNode1);
        Assert.assertEquals(4, result.getVal());

    }
}
