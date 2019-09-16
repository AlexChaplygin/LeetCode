package intersection_of_two_arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntersectionOfTwoArraysTest {

    @Test
    public void intersectionTest() {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        int res[] = intersectionOfTwoArrays.intersection(nums1, nums2);
        Assert.assertTrue(Arrays.equals(res, new int[]{2}));
    }
}
