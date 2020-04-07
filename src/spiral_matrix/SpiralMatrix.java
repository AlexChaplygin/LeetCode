package spiral_matrix;

/*
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList = new ArrayList<>();

        if (matrix.length == 0)
            return resultList;

        if (matrix.length == 1) {
            return Arrays.stream(matrix[0]).boxed().collect(Collectors.toList());
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int len = (matrix.length) * (matrix[0].length);

        while (top < matrix.length || bottom > 0 || left < matrix.length || right > 0) {

            for (int j = left; j <= right && len != resultList.size(); j++) {
                resultList.add(matrix[top][j]);
            }
            top++;
            for (int j = top; j <= bottom && len != resultList.size(); j++) {
                resultList.add(matrix[j][right]);
            }
            right--;
            for (int j = right; j >= left && len != resultList.size(); j--) {
                resultList.add(matrix[bottom][j]);
            }
            bottom--;
            for (int j = bottom; j >= top && len != resultList.size(); j--) {
                resultList.add(matrix[j][left]);
            }
            left++;
        }

        return resultList;
    }
}
