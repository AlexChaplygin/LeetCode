package battleships_in_a_board;

import org.junit.Test;

public class BattleshipsInaBoardTest {

    /*
    X..X
...X
...X
     */

    @Test
    public void countBattleshipsTest() {
        BattleshipsInaBoard battleshipsInaBoard = new BattleshipsInaBoard();
        battleshipsInaBoard.countBattleships(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}});
    }
}
