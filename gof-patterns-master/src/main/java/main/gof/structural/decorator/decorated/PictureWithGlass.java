package main.gof.structural.decorator.decorated;

import main.gof.structural.decorator.base.Picture;

/**
 * Created by zmax.
 * Create picture with glass
 */
public class PictureWithGlass implements Picture {

    protected Picture decoratedPicture;

    public PictureWithGlass(Picture decoratedPicture) {
        this.decoratedPicture = decoratedPicture;
    }

    public void draw() {
        decoratedPicture.draw();
        System.out.println("Draw glass");
    }

    public void getDescription() {
        System.out.println("This is the picture with glass");
    }

}

