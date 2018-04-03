package self_dividing_numbers;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SelfDividingNumbersTest {

    @Test
    public void selfDividingNumbersTest() {

        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        List<Integer> list = selfDividingNumbers.selfDividingNumbers(1, 22);

        String[] result = new String[]{""};

        list.stream().forEach(l-> result[0] += l);

        Assert.assertEquals(result[0], "12345678911121522");
    }
}
