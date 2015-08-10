package main.gof.behaviour.iterator;

import junit.framework.Assert;
import main.gof.behaviour.iterator.object.DVD;
import org.junit.Test;

public class ArrayObjectsSurferIteratorTest {

    @Test
    public void iteratorTest() {
        DVD dvd1 = new DVD();
        dvd1.setTitle("Title 1");

        DVD dvd2 = new DVD();
        dvd2.setTitle("Title 2");

        DVD[] arrayDVD = {dvd1, dvd2};
        ArrayObjectsSurferIterator arrayObjectsSurfer = new ArrayObjectsSurferIterator(arrayDVD);

        DVD dvd;
        int counter=0;
        while (arrayObjectsSurfer.hasNext()) {
            dvd = (DVD) arrayObjectsSurfer.next();
            Assert.assertTrue(dvd.getTitle().equals(arrayDVD[counter].getTitle()));
            System.out.println(dvd.getTitle());
            counter++;
        }

    }
}
