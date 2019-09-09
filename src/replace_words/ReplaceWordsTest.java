package replace_words;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReplaceWordsTest {

    @Test
    public void replaceWordsTest() {
        ReplaceWords replaceWords = new ReplaceWords();
        String result;
        result = replaceWords.replaceWords(Arrays.asList("cat", "bat", "rat"), "the cattle was rattled by the battery");
        Assert.assertEquals("the cat was rat by the bat", result);
        result = replaceWords.replaceWords(Arrays.asList("a","b","c"), "aadsfasf absbs bbab cadsfafs");
        Assert.assertEquals("a a b c", result);
    }
}
