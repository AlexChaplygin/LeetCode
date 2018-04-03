package array_partition_I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
n is a positive integer, which is in the range of [1, 10000].
All the integers in the array will be in the range of [-10000, 10000].
*/

public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(Arrays.stream( nums ).boxed().toArray( Integer[]::new )));

        Collections.sort(arrayList);

        int result = 0;

        for(int i = 0; i < arrayList.size(); i = i+2 ) {
            result += getMin(arrayList.get(i), arrayList.get(i+1));
        }

        return result;
    }

    private int getMin(int one, int two) {
        if(one > two)
            return two;

        return one;
    }

}
