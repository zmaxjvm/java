package main.gof.creational.prototype;

import main.gof.creational.prototype.items.DVD;
import org.junit.Test;

public class ProductCacheTest {

    @Test
    public void prototypeTest() {
        ProductCache.loadCache();

        DVD clonedDVD = (DVD) ProductCache.getProductClone("D1");
        String dvdClonedId = clonedDVD.getId();
        String dvdAuthor = clonedDVD.getDescription();
        int dvdDuration = clonedDVD.getDuration();

        System.out.println("Movie id = " + dvdClonedId);
        System.out.println("Movie author = " + dvdAuthor);
        System.out.println("Movie duration = " + dvdDuration);


        clonedDVD.setDuration(163);
        clonedDVD.setDescription("Avatar");
        clonedDVD.setId("A1");

        String dvdClonedIdAfterChange = clonedDVD.getId();
        String dvdAuthorAfterChange = clonedDVD.getDescription();
        int dvdDurationAfterChange = clonedDVD.getDuration();

        System.out.println("Movie id after change = " + dvdClonedIdAfterChange);
        System.out.println("Movie author after change = " + dvdAuthorAfterChange);
        System.out.println("Movie duration after change = " + dvdDurationAfterChange);

    }

}


