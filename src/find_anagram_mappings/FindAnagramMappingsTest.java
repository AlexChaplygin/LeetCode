package find_anagram_mappings;

import org.junit.Assert;
import org.junit.Test;

public class FindAnagramMappingsTest {

    @Test
    public void anagramMappingsTest() {

        FindAnagramMappings findAnagramMappings = new FindAnagramMappings();

        int[] check = {1, 4, 3, 2, 0};

        int[] p = findAnagramMappings.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});

        Assert.assertTrue(check.length == p.length);

        for(int i = 0; i < check.length; i++) {
            Assert.assertTrue(check[i] == p[i]);
        }
    }
}
