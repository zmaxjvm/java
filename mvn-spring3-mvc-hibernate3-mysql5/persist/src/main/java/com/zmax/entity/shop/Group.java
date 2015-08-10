package com.zmax.entity.shop;

import javax.persistence.*;
import java.util.List;

/**
 * Created by zmax.
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "GROUPS")
@NamedQueries({
        @NamedQuery(name = Group.GET_ALL_GROUPS_QUERY, query = "select g from Group g"),
        @NamedQuery(name = Group.GET_GROUP_BY_ID_QUERY, query = "select g from Group g where g.id = ?")
})
public class Group {

    private static final long serialVersionUID = 8496087166198616020L;
    public static final String GET_ALL_GROUPS_QUERY = "getAllGroups";
    public static final String GET_GROUP_BY_ID_QUERY = "getGroupById";

    @Id
    @GeneratedValue
    @Column(name = "id_group")
    private Long id;

    @Column(name = "name_group")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "link_to_the_products")
    private List<Product> productList;

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

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
