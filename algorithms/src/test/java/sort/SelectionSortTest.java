package sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class SelectionSortTest {

    private int[] a = {2, 1, 4, 3, 5, 9, 8, 7, 6};
    private int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private SelectionSort sSort = new SelectionSort();

    @Test
    public void testSort() {
        int[] res = sSort.sort(a);
        Assert.assertArrayEquals(res, expected);
    }
}