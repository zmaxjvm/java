package com.zmax.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * Created by zmax.
 *
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractHibernateDao {
    private HibernateTemplate hibernateTemplate;

    /**
     * Provide automatic make sessionFactory with spring bean.
     * @param sessionFactory
     */
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    /**
     * @return HibernateTemplate
     */
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    /**
     * for unit test
     * @param hibernateTemplate set hibernate template
     */
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    /**
     *
     * @return actual hibernate template
     */
    public HibernateTemplate getActualHibernateTemplate() {
        if (hibernateTemplate != null) {
            return hibernateTemplate;
        } else {
            return getHibernateTemplate();
        }
    }

}

