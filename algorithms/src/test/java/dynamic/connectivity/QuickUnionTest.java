package dynamic.connectivity;

import org.junit.Test;

/**
 * Created by zmax.
 */
public class QuickUnionTest {

    QuickUnion quickUnion = new QuickUnion(10);

    @Test
    public void testUnion() {
        quickUnion.union(7, 6);
        quickUnion.union(5, 8);
        quickUnion.union(0, 6);
        quickUnion.union(4, 3);
        quickUnion.union(9, 1);
        quickUnion.union(8, 2);
        quickUnion.status();
        //6 1 2 3 3 2 6 6 2 1
    }
}