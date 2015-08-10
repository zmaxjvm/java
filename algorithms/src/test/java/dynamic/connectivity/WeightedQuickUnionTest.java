package dynamic.connectivity;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class WeightedQuickUnionTest {

    WeightedQuickUnion wu = new WeightedQuickUnion(10);

    @Test
    public void testUnion() {
        wu.union(1,9);
        wu.union(5,7);
        wu.union(0,5);
        wu.union(3,8);
        wu.union(4,2);
        wu.union(4,9);
        wu.union(8,7);
        wu.union(8,2);
        wu.union(0,6);
        wu.status();
    }
}