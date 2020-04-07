package diagonal_traverse;

/*
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new int[0];
        List<Integer> tmp = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length + matrix[0].length - 1; i++) {
            int hi = i < matrix[0].length ? 0 : i - matrix[0].length + 1;
            int hj = i < matrix[0].length ? i : matrix[0].length - 1;

            tmp.clear();

            while (hi < matrix.length && hj > -1) {
                tmp.add(matrix[hi][hj]);
                hi++;
                hj--;
            }
            if (i % 2 == 0)
                Collections.reverse(tmp);

            res.addAll(tmp);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
