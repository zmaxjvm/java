package sort;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class InsertionSortTest {

    private int[] a = {2, 1, 4, 3, 5, 9, 8, 7, 6};
                             //16 20  32  36  94  98  92  31  51  76
    private int[] asigment = {16, 20, 32, 36, 94, 98, 92, 31, 51, 76};

    private int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};


    private InsertionSort iSort = new InsertionSort();

    @Test
    public void testSort() {
        int[] res0 = iSort.sort(asigment);
      // int[] res = iSort.sort(a);
      //  Assert.assertArrayEquals(res, expected);
    }
}