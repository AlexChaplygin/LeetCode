package add_two_numbers;

import org.junit.Test;
import utils.ListNode;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbersTest(){

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.setNext(listNode5);
        listNode5.setNext(listNode6);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(listNode1, listNode4);
    }
}
