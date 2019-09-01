package all_paths_from_source_to_target;

import org.junit.Test;

public class AllPathsFromSourcetoTargetTest {

    @Test
    public void allPathsSourceTarget() {
        AllPathsFromSourcetoTarget allPathsFromSourcetoTarget = new AllPathsFromSourcetoTarget();
        allPathsFromSourcetoTarget.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}});
    }
}
