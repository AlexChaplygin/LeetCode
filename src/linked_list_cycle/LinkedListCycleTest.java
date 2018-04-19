package linked_list_cycle;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

public class LinkedListCycleTest {

    @Test
    public void hasCycleTest() {
        ListNode listNode = new ListNode(1);
        listNode.setNext(new ListNode(2));
        listNode.setNext(new ListNode(3));
        listNode.setNext(new ListNode(4));
        listNode.setNext(new ListNode(5));
        listNode.setNext(new ListNode(6));
        listNode.setNext(new ListNode(7));
        listNode.setNext(new ListNode(8));
        listNode.setNext(listNode);


        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Assert.assertTrue(linkedListCycle.hasCycle(listNode));

        ListNode listNode1 = new ListNode(1);
        listNode1.setNext(new ListNode(2));
        listNode1.setNext(new ListNode(3));
        listNode1.setNext(new ListNode(4));
        listNode1.setNext(new ListNode(5));
        listNode1.setNext(new ListNode(6));
        listNode1.setNext(new ListNode(7));
        listNode1.setNext(new ListNode(8));

        linkedListCycle = new LinkedListCycle();
        Assert.assertFalse(linkedListCycle.hasCycle(listNode1));
    }

}
