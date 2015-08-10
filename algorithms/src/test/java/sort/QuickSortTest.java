package sort;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class QuickSortTest {

    private int[] t = {86, 14, 37, 23, 81, 97, 92, 43, 69, 21, 28, 83};
    private int[] e = {2, 1, 9, 6, 5, 4, 7, 8, 3};

    private Sort qsort = new QuickSort();

    @Test
    public void testSort() {
        int[] r = qsort.sort(t);
        System.out.print(r);
    }
}