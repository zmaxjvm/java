package com.zmax.entity.shop;

import javax.persistence.*;

/**
 * Created by zmax.
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "PRODUCTS")
public class Product {
    private static final long serialVersionUID = 8496087166111222820L;

    @Id
    @GeneratedValue
    @Column(name = "id_product")
    private Long id;

    @Column(name = "name_product")
    private String name;

    @Column(name = "price_product")
    private Long price;

    @ManyToOne(fetch = FetchType.EAGER)
    private Group group;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
