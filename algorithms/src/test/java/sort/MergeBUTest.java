package sort;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class MergeBUTest {

    private Integer[] integer = {84, 45, 31, 56, 85, 90, 61, 82, 86, 52};

    @Test
    public void testSort() {
        MergeBU.sort(integer);
    }
}