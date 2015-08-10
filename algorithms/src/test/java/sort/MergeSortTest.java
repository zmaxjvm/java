package sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class MergeSortTest {

    private int[] t = {75, 29, 38, 19, 45, 15, 58, 84, 25, 54, 33, 12};

    private int[] e = {2, 1, 9, 6, 5, 4, 7, 8, 3};
    private int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void testSort() {
        //int[] r = mergeSort.sort(e);
        int[] r = mergeSort.sort(t);

        Assert.assertArrayEquals(r, expected);
    }
}