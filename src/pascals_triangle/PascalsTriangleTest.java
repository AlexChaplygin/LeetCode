package pascals_triangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void generateTest() {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> list = pascalsTriangle.generate(5);
        Assert.assertTrue(list.size() == 5);
        Assert.assertTrue(list.get(list.size() - 1).equals(new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1))));
    }
}
