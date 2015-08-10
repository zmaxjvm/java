package sort;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class ShellSortTest extends TestCase {
              //79 13  27  26  62  69  12  15  61  99
    int[] a = {79, 13, 27, 26, 62, 69, 12, 15, 61, 99};

    ShellSort shellSort = new ShellSort();

    @Test
    public void testSort() {
        int[] res = shellSort.sort(a);
    }
}