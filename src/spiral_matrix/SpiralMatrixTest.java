package spiral_matrix;

import org.junit.Assert;
import org.junit.Test;

public class SpiralMatrixTest {

    @Test
    public void spiralOrderTest() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        int[][] array2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] array3 = {
                {6}, {2}};
        int[][] array4 = {
                {6}, {2}, {2}, {2}};
        int[][] array5 = {
                {6},
                {7},
                {8}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();

        Assert.assertTrue(spiralMatrix.spiralOrder(array).size() == 12);
        Assert.assertTrue(spiralMatrix.spiralOrder(array1).size() == 12);
        Assert.assertTrue(spiralMatrix.spiralOrder(array2).size() == 9);
        Assert.assertTrue(spiralMatrix.spiralOrder(array3).size() == 2);
        Assert.assertTrue(spiralMatrix.spiralOrder(array4).size() == 4);
        Assert.assertTrue(spiralMatrix.spiralOrder(array5).size() == 3);
    }
}
