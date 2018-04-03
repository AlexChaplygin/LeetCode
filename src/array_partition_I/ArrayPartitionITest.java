package array_partition_I;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartitionITest {

    @Test
    public void arrayPairSumTest() {
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int result = arrayPartitionI.arrayPairSum(new int[]{1,4,3,2});

        Assert.assertTrue(result == 4);
    }

}
