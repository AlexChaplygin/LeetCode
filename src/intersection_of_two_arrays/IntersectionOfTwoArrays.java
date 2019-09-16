package intersection_of_two_arrays;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> buffer = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !buffer.contains(nums1[i])) {
                    buffer.add(nums1[i]);
                    continue;
                }
            }
        }
        return buffer.stream().mapToInt(i -> i).toArray();
    }
}
