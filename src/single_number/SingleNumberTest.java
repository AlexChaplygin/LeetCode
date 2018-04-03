package single_number;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {

    @Test
    public void singleNumberTest(){
        int[] array = new int[]{4, 3,4,5,5,6,6,7, 15, 7,8,3,8,9,9, 11, 11};

        SingleNumber singleNumber = new SingleNumber();
        Assert.assertEquals(singleNumber.singleNumber(array), 15);
    }
}
