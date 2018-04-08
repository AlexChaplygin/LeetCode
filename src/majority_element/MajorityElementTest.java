package majority_element;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void majorityElementTest() {
        MajorityElement majorityElement = new MajorityElement();

        int[] nums = {2,2,4,4,2,4,4,4,2,4,4,5,6,6,8,2,4,4,4,2,2,1,2,1,23,65,4,2,65,44};

        int res = majorityElement.majorityElement(nums);

        Assert.assertTrue(res == 4);
    }
}
