package exercises;

/**
 * Created by zmax.
 */
public class MatrixSpiral {


    public String spiralExecutionFast(String[][] matrix, int size) {
        StringBuilder res = new StringBuilder();

        size = size - 1;
        for (int i = 0; i < size / 2 + 1; i++) {
            //printRow
            for (int j = i; j <= size - i; j++) {
                res.append(" - " + matrix[i][j]);
            }

            //printColumn
            for (int j = i + 1; j <= size - i; j++) {
                res.append(" - " + matrix[j][size - i]);
            }

            // printRowBack
            for (int j = size - i - 1; j >= i; j--) {
                res.append(" - " + matrix[size - i][j]);
            }

            //printColumnUp
            for (int j = size - i - 1; j >= i + 1; j--) {
                res.append(" - " + matrix[j][i]);
            }
        }
        return res.toString();
    }

}
