package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * */

public class PascalsTriangle {

    /* Example
    *   Input: 5
        Output:
        [
             [1],
            [1,1],
           [1,2,1],
          [1,3,3,1],
         [1,4,6,4,1]
        ]
    * */

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (i == 0 || j - 1 < 0 || j + 1 > i)
                    list.add(1);
                else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }

        return result;
    }
}
