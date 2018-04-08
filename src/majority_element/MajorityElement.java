package majority_element;

import java.util.Arrays;

/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
*/

public class MajorityElement {

    public int majorityElement(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        Arrays.sort(nums);

        int result = 0;
        int temp = 0;
        int count = 0;
        int count_temp = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                count++;
                temp = nums[i];
            } else {
                if(count > count_temp) {
                    result = nums[i];
                    count_temp = count;
                    count = 0;
                }
            }
        }

        return count > count_temp ? temp : result;

    }

}
