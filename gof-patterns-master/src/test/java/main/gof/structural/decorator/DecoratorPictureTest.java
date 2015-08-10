package main.gof.structural.decorator;

import main.gof.structural.decorator.base.Picture;
import main.gof.structural.decorator.base.PictureSimple;
import main.gof.structural.decorator.decorated.PictureWithBorder;
import main.gof.structural.decorator.decorated.PictureWithGlass;
import org.junit.Test;

public class DecoratorPictureTest {

    @Test
    public void createPictureWithBorder() {
        Picture pictureSimple = new PictureSimple();
        Picture pictureWithBorder = new PictureWithBorder(pictureSimple);

        pictureWithBorder.draw();
    }

    @Test
    public void createPictureWithBorderAndGlass() {
        Picture pictureSimple = new PictureSimple();
        Picture pictureWithBorder = new PictureWithBorder(pictureSimple);
        Picture pictureWithGlass = new PictureWithGlass(pictureWithBorder);

        pictureWithGlass.draw();
    }
}


