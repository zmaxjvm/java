package main.gof.structural.decorator.decorated;

import main.gof.structural.decorator.base.Picture;

/**
 * Created by zmax.
 * Create picture with border
 */
public class PictureWithBorder  implements Picture {

    protected Picture decoratedPicture;

    public PictureWithBorder(Picture decoratedPicture) {
        this.decoratedPicture = decoratedPicture;
    }

    public void draw() {
        decoratedPicture.draw();
        System.out.println("Draw border");
    }

    public void getDescription() {
        System.out.println("This is the picture with border");
    }

}

