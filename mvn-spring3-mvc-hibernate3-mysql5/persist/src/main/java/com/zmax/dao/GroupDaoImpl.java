package com.zmax.dao;

import com.zmax.entity.shop.Group;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zmax.
 *
 */
@Repository
@Transactional
public class GroupDaoImpl extends AbstractHibernateDao implements GroupDao {


    @Override
    public void saveOrUpdateGroup(Group group) {
        getActualHibernateTemplate().saveOrUpdate(group);
    }

    @Override
    public List<Group> getAllGroupsIntoDatabase() {
        return getActualHibernateTemplate().findByNamedQuery(Group.GET_ALL_GROUPS_QUERY);
    }

    @Override
    public Group getGroupById(Long id) {
        List<Group> groupList = getActualHibernateTemplate().findByNamedQuery(Group.GET_GROUP_BY_ID_QUERY, id);
        if(groupList.size() > 0){
            return groupList.get(0);
        }
        //TODO write to log
        else return null;

    }
}


