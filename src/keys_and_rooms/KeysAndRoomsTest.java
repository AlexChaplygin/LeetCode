package keys_and_rooms;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KeysAndRoomsTest {

    @Test
    public void canVisitAllRooms() {
        KeysAndRooms keysAndRooms = new KeysAndRooms();

        /*
        Input: [[1],[2],[3],[]]
        Output: true
        Explanation:
        We start in room 0, and pick up key 1.
        We then go to room 1, and pick up key 2.
        We then go to room 2, and pick up key 3.
        We then go to room 3.  Since we were able to go to every room, we return true.
         */

        Assert.assertTrue(keysAndRooms.canVisitAllRooms(assemble(new int[][]{{1},{2},{3},{}})));

        /*
        Input: [[1,3],[3,0,1],[2],[0]]
        Output: false
         */

        Assert.assertFalse(keysAndRooms.canVisitAllRooms(assemble(new int[][]{{1,3},{3,0,1},{2},{2},{0}})));

        /*
        [[2],[],[1]]
        true
         */

        Assert.assertTrue(keysAndRooms.canVisitAllRooms(assemble(new int[][]{{2},{},{1},{}})));

        /*
        [[1,3],[1,4],[2,3,2,4,1],[],[4,3,2]]
        true
         */

        Assert.assertTrue(keysAndRooms.canVisitAllRooms(assemble(new int[][]{{1,3},{1,4},{2,3,2,4,1},{},{4,3,2}})));

        /*
        [[7,16,8,16,19,8],[10],[9,11],[3,14,16,19],[8,10,19,1,7],[13,5,10,15,4],[6,13],[14,14,11,12,18],[3],[17,9],[1,2,6,9,6],[12,12,2],[4,4],[2,13,17],[17],[],[11,15],[3,5],[15,18,5],[7,18,1]]
         */

        Assert.assertTrue(keysAndRooms.canVisitAllRooms(assemble(new int[][]{{7,16,8,16,19,8},{10},{9,11},{3,14,16,19},{8,10,19,1,7},{13,5,10,15,4},{6,13},{14,14,11,12,18},
            {3},{17,9},{1,2,6,9,6},{12,12,2},{4,4},{2,13,17},{17},{},{11,15},{3,5},{15,18,5},{7,18,1}})));
    }

    private List<List<Integer>> assemble(int array[][]) {
        List<List<Integer>> rooms = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            rooms.add(Arrays.stream(array[i]).boxed().collect(Collectors.toList()));
        }

        return rooms;
    }
}
