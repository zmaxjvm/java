package exercises;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class TicTacToeTest {

    public static char resGame0[][] = {
            {'o', 'o', 'x'},
            {'x', 'x', 'x'},
            {'o', '_', 'o'},
    };

    public static char resGame1[][] = {
            {'o', 'x', 'o'},
            {'_', 'o', 'x'},
            {'_', 'x', 'o'},
    };

    public static char resGame2[][] = {
            {'o', 'o', 'o'},
            {'_', 'x', 'x'},
            {'_', 'x', 'o'},
    };

    public static char resGame3[][] = {
            {'o', 'x', '_'},
            {'o', 'x', 'x'},
            {'o', 'o', '_'},
    };

    @Test
    public void testCheckResultGame() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.checkResultGame(resGame0, 'o', "Game 0");
        ticTacToe.checkResultGame(resGame0, 'x', "Game 0");
        ticTacToe.checkResultGame(resGame1, 'o', "Game 1");
        ticTacToe.checkResultGame(resGame1, 'x', "Game 1");
        ticTacToe.checkResultGame(resGame2, 'o', "Game 2");
        ticTacToe.checkResultGame(resGame2, 'x', "Game 2");
    }

}
