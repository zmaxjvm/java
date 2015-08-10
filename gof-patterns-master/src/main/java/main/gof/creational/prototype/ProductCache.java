package main.gof.creational.prototype;

import main.gof.creational.prototype.items.DVD;
import main.gof.creational.prototype.items.Product;

import java.util.Hashtable;

/**
 *
 * Created by zmax.
 *
 * Class provide to create new base objects and provide copy them
 */
public class ProductCache {
    private static Hashtable productMap = new Hashtable();

    /**
     * get object clone by ID
     *
     * @param productCode
     * @return
     */
    public static Product getProductClone(String productCode) {
        Product cachedProduct = (Product) productMap.get(productCode);
        return (Product) cachedProduct.clone();
    }

    /**
     * Method provide to make base objects
     */
    public static void loadCache() {
        //create default product for clone process

        DVD d1 = new DVD();
        d1.setDescription("Supermen");
        d1.setId("D1");
        d1.setDuration(180);
        productMap.put(d1.getId(), d1);

        //add additional products
        //...
    }

}
