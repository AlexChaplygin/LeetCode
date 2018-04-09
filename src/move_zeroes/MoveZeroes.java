package move_zeroes;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < nums.length; i++) {

                if (nums[i - 1] == 0 && nums[i - 1] != nums[i]) {
                    swap = true;
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }

            }
        } while (swap);

    }

}
