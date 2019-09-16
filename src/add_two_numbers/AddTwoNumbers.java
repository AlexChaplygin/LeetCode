package add_two_numbers;

import utils.ListNode;

import java.math.BigInteger;

/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String numOneStr = "";
        BigInteger numOne;
        String numTwoStr = "";
        BigInteger numTwo;
        String resVal = "";
        ListNode result = null;
        ListNode temp = null;
        while (l1 != null) {
            numOneStr = l1.getVal() + numOneStr;
            l1 = l1.getNext();
        }
        while (l2 != null) {
            numTwoStr = l2.getVal() + numTwoStr;
            l2 = l2.getNext();
        }
        numOne = new BigInteger(numOneStr);
        numTwo = new BigInteger(numTwoStr);
        resVal = String.valueOf(numOne.add(numTwo));
        for (int i = resVal.length() - 1; i >= 0; i--) {
            if (result == null) {
                result = new ListNode(Character.getNumericValue(resVal.charAt(i)));
                temp = result;
            } else {
                ListNode newList = new ListNode(Character.getNumericValue(resVal.charAt(i)));
                temp.setNext(newList);
                temp = newList;
            }
        }
        return result;
    }
}
