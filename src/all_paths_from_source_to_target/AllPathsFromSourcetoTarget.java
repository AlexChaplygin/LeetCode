package all_paths_from_source_to_target;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget {

/*
    Input: [[1,2], [3], [3], []]
    Output: [[0,1,3],[0,2,3]]
*/

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<Integer> path = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        path.add(0);

        count(graph, finalList, 0, path);

        return finalList;
    }

    private void count(int[][] graph, List<List<Integer>> finalList, int value, List<Integer> path) {
        if (value == graph.length - 1) {
            finalList.add(new ArrayList<>(path));
            return;
        }

        for (int val : graph[value]) {
            path.add(val);
            count(graph, finalList, val, path);
            path.remove(path.size() - 1);
        }
    }
}
