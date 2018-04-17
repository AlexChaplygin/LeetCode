package unique_morse_code_words;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWordsTest {

    @Test
    public void uniqueMorseRepresentationsTest() {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        int val = uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});

        Assert.assertTrue(val == 2);
    }

}
