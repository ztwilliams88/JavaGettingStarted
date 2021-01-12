import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    /**
     * **** WE NEED TO REPLACE THIS WITH BOWLING RULES *****
     */
    BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void whenRollingAllGutterBallsScoreIsZero() {
        rollMany(20, 0);

        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void whenRollingOpenFrameScoreIsSumOfRolls() {
        rollMany(20, 1);

        assertEquals(20, bowlingGame.score());
    }

    // TODO CODE: Start here
    @Test
    public void whenRollingSpareFrameScoreIsTenPlusNextRoll() {
        bowlingGame.roll(3);
        bowlingGame.roll(7);
        bowlingGame.roll(3);
        rollMany(17, 0);

        assertEquals(16, bowlingGame.score());
    }

    @Test
    public void whenRollingStrikeFrameScoreIsTenPlusNextTwoRolls() {
        bowlingGame.roll(10);
        bowlingGame.roll(7);
        bowlingGame.roll(1);
        rollMany(16, 0);

        assertEquals(26, bowlingGame.score());
    }

    private void rollMany(int rollCount, int pins) {
        for(int i = 0; i < rollCount; i++) {
            bowlingGame.roll(pins);
        }
    }

}
