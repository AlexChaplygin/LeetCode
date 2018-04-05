package terge_two_sorted_lists;

import org.junit.Assert;
import org.junit.Test;
import utils.ListNode;

public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoListsTest() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode8 = new ListNode(8);

        listNode1.setNext(listNode2);
        listNode2.setNext(listNode4);
        listNode4.setNext(listNode8);

        ListNode _listNode1 = new ListNode(1);
        ListNode _listNode3 = new ListNode(3);
        ListNode _listNode4 = new ListNode(4);

        _listNode1.setNext(_listNode3);
        _listNode3.setNext(_listNode4);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode result = mergeTwoSortedLists.mergeTwoLists(listNode1, _listNode1);

        Assert.assertTrue(stringList(result).equals("1123448"));
    }

    private String stringList(ListNode listNode) {

        ListNode temp = listNode;
        String result = "";

        while(temp != null) {
            result += temp.getVal();
            temp = temp.getNext();
        }

        return result;
    }

}
