package com.zmax.dao;

import com.zmax.entity.shop.Group;

import java.util.List;

/**
 * Created by zmax
 *
 * To change this template use File | Settings | File Templates.
 */
public interface GroupDao {

    void saveOrUpdateGroup(Group group);

    List<Group> getAllGroupsIntoDatabase();

    Group getGroupById(Long id);
}
