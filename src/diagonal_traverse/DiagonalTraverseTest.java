package diagonal_traverse;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DiagonalTraverseTest {

    @Test
    public void findDiagonalOrderTest() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        Assert.assertTrue(Arrays.equals(new int[]{1, 2, 4, 7, 5, 3, 6, 8, 9}, diagonalTraverse.findDiagonalOrder(array)));
    }
}
