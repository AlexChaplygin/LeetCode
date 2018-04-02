package jewels_and_stones;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void numJewelsInStonesTest() {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        Assert.assertTrue(jewelsAndStones.numJewelsInStones("aA", "aAAbbbb") == 3);
        Assert.assertTrue(jewelsAndStones.numJewelsInStones("f", "aAAbbbb") == 0);
    }
}