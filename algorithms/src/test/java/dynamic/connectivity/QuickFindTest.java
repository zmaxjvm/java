package dynamic.connectivity;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zmax.
 */
public class QuickFindTest {

    private QuickFind quickFind = new QuickFind(10);

    @Test
    public void testUnion() {
        Assert.assertTrue(!quickFind.connected(0, 1));
    }



    @Test
    public void q1() {
        quickFind.union(3, 1);
        quickFind.union(0, 1);
        quickFind.union(1, 6);
        quickFind.union(7, 1);
        quickFind.union(7, 9);
        quickFind.union(2, 0);
        quickFind.printConnections();
        //9 9 9 9 4 5 9 9 8 9
    }


}