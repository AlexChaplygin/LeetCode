package two_sum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = null;

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for(int i = 0; i < nums.length; i++) {
            if(list.contains(target - nums[i]) && list.indexOf(target - nums[i]) != i) {
                result = new int[]{list.indexOf(target - nums[i]),i};
            }
        }

        return result;
    }

}
