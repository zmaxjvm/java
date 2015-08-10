package dynamic.connectivity;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class WeightCompressedQuickUnionTest {

    private WeightCompressedQuickUnion wu = new WeightCompressedQuickUnion(10);

    @Test
    public void testUnion() {
        wu.union(3,1);
        wu.union(8,0);
        wu.union(9,1);
        wu.union(5,4);
        wu.union(1,2);
        wu.union(3,6);
        wu.union(8,4);
        wu.union(7,2);
        wu.union(1,5);
        wu.status();
    }
}