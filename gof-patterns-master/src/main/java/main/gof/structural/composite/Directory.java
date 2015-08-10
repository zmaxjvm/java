package main.gof.structural.composite;

import main.gof.structural.composite.objects.AbstractFile;

import java.util.ArrayList;

/**
 * Created by zmax.
 * Class directory, include possibility to add leaf objects, which implements AbstractFile
 */
public class Directory implements AbstractFile{

    private String directoryName;
    private ArrayList<AbstractFile> listFiles = new ArrayList<AbstractFile>();

    public Directory(String name) {
        directoryName = name;
    }


    public void add(AbstractFile file) {
        listFiles.add(file);
    }

    public ArrayList<AbstractFile> getListFiles() {
        return listFiles;
    }

    /**
     * Print files into directory
     */
    public void ls() {
        System.out.println("\n---" + directoryName + "---");
        for (AbstractFile file : listFiles) {
            // Leverage the "lowest common denominator"
            file.ls();
        }
    }
}
