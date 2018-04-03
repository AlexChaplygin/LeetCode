package nim_game;

import org.junit.Assert;
import org.junit.Test;

public class NimGameTest {

    @Test
    public void canWinNimTest() {
        NimGame nimGame = new NimGame();

        Assert.assertTrue(nimGame.canWinNim(11));
        Assert.assertTrue(nimGame.canWinNim(5));
        Assert.assertTrue(nimGame.canWinNim(6));
        Assert.assertFalse(nimGame.canWinNim(8));
    }
}
