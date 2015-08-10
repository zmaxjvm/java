package exercises;

/**
 * Created by zmax.
 */
public class TicTacToe {

    final void checkResultGame(char[][] game, char player, String gameName) {
        if (checkColumnsAndRows(game, player) || checkDiagonals(game, player)) {
            System.out.println(gameName + " - player " + player + " won!");
        } else {
            System.out.println(gameName + " - player " + player + " lost...");
        }
    }

    private static boolean isArrHasSameSymbols(char[] arr, char symb) {
        for (int i = 0; i < arr.length; i++) {
            if (symb != arr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param game   input game result
     * @param player player for the check
     * @return true if player won, else return false
     */
    private boolean checkColumnsAndRows(char game[][], char player) {
        char[] column = new char[game.length];
        char[] row = new char[game.length];
        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game.length; j++) {
                column[j] = game[i][j];
                row[j] = game[j][i];
            }
            if (isArrHasSameSymbols(column, player) || isArrHasSameSymbols(row, player)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param game input game result
     * @param player player for the check
     * @return true if player won, else return false
     */
    private boolean checkDiagonals(char game[][], char player) {
        char[] main = new char[game.length];

        for (int i = 0; i < game.length; i++) {
            main[i] = game[i][i];
        }

        if (isArrHasSameSymbols(main, player)) {
            return true;
        }

        int k = 0;
        for (int i = game.length - 1; i >= 0; i--) {
            main[i] = game[i][k];
            k++;
        }

        if (isArrHasSameSymbols(main, player)) {
            return true;
        }
        return false;
    }

}
