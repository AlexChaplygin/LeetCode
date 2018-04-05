package delete_node_linked_list;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

public class DeleteNodeLinkedListTest {

    @Test
    public void deleteNodeTest() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);

        DeleteNodeLinkedList deleteNodeLinkedList = new DeleteNodeLinkedList();
        deleteNodeLinkedList.deleteNode(listNode3);

        Assert.assertTrue(listNode1.getVal() == 1);
        Assert.assertTrue(listNode1.getNext().getVal() == 2);
        Assert.assertTrue(listNode1.getNext().getNext().getVal() == 4);
        Assert.assertTrue(listNode1.getNext().getNext().getNext() == null);
    }
}
