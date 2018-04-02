package reverse_words_string_III;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsStringIIITest {

    @Test
    public void reverseWordsTest() {
        ReverseWordsStringIII reverseWordsStringIII = new ReverseWordsStringIII();
        Assert.assertTrue(reverseWordsStringIII.reverseWords("Let's take LeetCode contest").
                equals("s'teL ekat edoCteeL tsetnoc"));
    }
}
