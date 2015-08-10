package main.gof.structural.composite.objects;

/**
 * Created by zmax.
 * Simple file
 */
public class FilePDF implements AbstractFile {
    private String fileName;

    public FilePDF(String name) {
        fileName = name;
    }

    public void ls() {
        System.out.println("file PDF ->" + fileName);
    }

}