package add_digits;

import org.junit.Assert;
import org.junit.Test;

public class AddDigitsTest {

    @Test
    public void addDigitsTest() {
        AddDigits addDigits = new AddDigits();
        int result = addDigits.addDigits(38);
        Assert.assertEquals(2, result);
    }
}
