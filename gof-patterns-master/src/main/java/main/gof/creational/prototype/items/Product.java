package main.gof.creational.prototype.items;

/**
 * Created by zmax.
 */
abstract public class Product implements Cloneable {
    private String id;
    private String description;

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public void setDescription(String string) {
        description = string;
    }

    public void setId(String string) {
        id = string;
    }
}
