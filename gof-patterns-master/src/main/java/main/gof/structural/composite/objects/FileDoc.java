package main.gof.structural.composite.objects;

/**
 * Created by zmax.
 * Simple file
 */
public class FileDoc implements AbstractFile {
    private String fileName;

    public FileDoc(String name) {
        fileName = name;
    }

    public void ls() {
        System.out.println("file doc ->" + fileName);
    }

}