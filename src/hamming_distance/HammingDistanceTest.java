package hamming_distance;

import org.junit.Assert;
import org.junit.Test;

public class HammingDistanceTest {

    @Test
    public void hammingDistanceTest() {
        HammingDistance hammingDistance = new HammingDistance();
        int res = hammingDistance.hammingDistance(1, 4);
        Assert.assertEquals(2, res);
    }
}
