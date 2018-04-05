package longest_common_prefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest() {

        String[] strs = {"c","acc","ccc"};
        String[] strs1 = {"c","cacc","ccc"};

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assert.assertTrue(longestCommonPrefix.longestCommonPrefix(strs).equals(""));
        Assert.assertTrue(longestCommonPrefix.longestCommonPrefix(strs1).equals("c"));

    }
}
