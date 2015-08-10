package com.zmax.dao;

import com.zmax.entity.shop.Group;
import com.zmax.entity.shop.Product;
import jdk.nashorn.internal.ir.annotations.Ignore;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zmax.
 * Integration tests for work with shop storing
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GroupDaoImplTest {

    @Autowired
    public GroupDao groupDaoImpl;

    /**
     * Provide to create test data into database
     */
    @Ignore
    @Test
    public void testSaveUserWithUserRoles() {
        Group group1 = new Group();
        group1.setName("1 test group");

        Group group2 = new Group();
        group2.setName("2 test group");

        Group group3 = new Group();
        group3.setName("3 test group");


        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        Product product5 = new Product();
        Product product6 = new Product();

        product1.setName("1 product");
        product1.setPrice(new Long(200));
        product2.setName("2 product");
        product2.setPrice(new Long(400));

        product3.setName("3 product");
        product3.setPrice(new Long(800));
        product4.setName("4 product");
        product4.setPrice(new Long(1600));
        product5.setName("5 product");
        product5.setPrice(new Long(8800));
        product6.setName("6 product");
        product6.setPrice(new Long(11600));


        List<Product> productList3 = new ArrayList<Product>();
        productList3.add(product1);
        productList3.add(product2);

        List<Product> productList2 = new ArrayList<Product>();
        productList2.add(product3);
        productList2.add(product4);
        productList2.add(product5);
        productList2.add(product6);


        group1.setProductList(new ArrayList<Product>());
        group2.setProductList(productList2);
        group3.setProductList(productList3);

        groupDaoImpl.saveOrUpdateGroup(group1);
        groupDaoImpl.saveOrUpdateGroup(group2);
        groupDaoImpl.saveOrUpdateGroup(group3);

        List<Group> groupLisResult = groupDaoImpl.getAllGroupsIntoDatabase();
        Assert.assertTrue(groupLisResult.get(0).getName().equals(group1.getName()));
    }
}
