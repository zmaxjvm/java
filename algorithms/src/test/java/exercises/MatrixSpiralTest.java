package exercises;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class MatrixSpiralTest {

    public static String matrix5x5[][] = {
            {"1", "2", "3", "4", "5"},

            {"16", "17", "18", "19", "6"},

            {"15", "24", "25", "20", "7"},

            {"14", "23", "22", "21", "8"},

            {"13", "12", "11", "10", "9"},
    };

    public static String res = " - 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20 - 21 - 22 - 23 - 24 - 25";

    @Test
    public void testMatrixSpiral() {
        MatrixSpiral matrixSpiral = new MatrixSpiral();
        String r = matrixSpiral.spiralExecutionFast(matrix5x5, 5);
        System.out.println(r);
        Assert.assertTrue(r.equals(res));
    }

}
