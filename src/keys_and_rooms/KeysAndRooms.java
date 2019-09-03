package keys_and_rooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new HashSet<>();
        keys.add(0);

        collectKeys(rooms, 0, keys);

        for (int i = 0; i < rooms.size(); i++) {
            if (!keys.contains(i) && rooms.get(i).size() != 0)
                return false;
        }

        return true;
    }

    private void collectKeys(List<List<Integer>> rooms, int index, Set<Integer> keys) {
        if (rooms.get(index).size() == 0 || keys.containsAll(rooms.get(index)))
            return;
        keys.addAll(rooms.get(index));
        rooms.get(index).forEach(val -> collectKeys(rooms, val, keys));
    }
}
