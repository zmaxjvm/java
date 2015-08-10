package main.gof.structural.decorator.base;

/**
 * Created by zmax.
 * Implementation of a simple Window without any decoration
 */
public class PictureSimple implements Picture {
    public void draw() {
        System.out.println("Draw simple picture");
    }

    public void getDescription() {
        System.out.println("This is the simple picture");
    }
}