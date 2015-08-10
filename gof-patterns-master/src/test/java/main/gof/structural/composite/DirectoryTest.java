package main.gof.structural.composite;

import junit.framework.Assert;
import main.gof.structural.composite.objects.AbstractFile;
import main.gof.structural.composite.objects.FileDoc;
import main.gof.structural.composite.objects.FilePDF;
import main.gof.structural.composite.objects.Image;
import org.junit.Test;


public class DirectoryTest {

    @Test
    public void DirectoryLsTest() {
        Directory firstDir = new Directory("dir1");
        Directory secondDir = new Directory("dir2");

        AbstractFile fileDocA = new FileDoc("a.doc");
        AbstractFile fileDocB = new FileDoc("b.doc");
        AbstractFile fileDocC = new FileDoc("c.doc");

        AbstractFile filePDFA = new FilePDF("a.pdf");
        AbstractFile filePDFB = new FilePDF("b.pdf");
        AbstractFile filePDFC = new FilePDF("c.pdf");

        AbstractFile imageA = new Image("sky1.jpg");
        AbstractFile imageB = new Image("snow.jpg");
        AbstractFile imageC = new Image("ice.jpg");

        firstDir.add(fileDocA);
        firstDir.add(fileDocB);
        firstDir.add(fileDocC);

        firstDir.add(imageA);
        firstDir.add(filePDFB);
        firstDir.add(filePDFA);

        secondDir.add(imageB);
        secondDir.add(imageC);
        secondDir.add(filePDFC);
        secondDir.add(firstDir);

        firstDir.ls();
        secondDir.ls();

        Assert.assertTrue(firstDir.getListFiles().size() == 6);
        Assert.assertTrue(secondDir.getListFiles().size() == 4);
    }
}


