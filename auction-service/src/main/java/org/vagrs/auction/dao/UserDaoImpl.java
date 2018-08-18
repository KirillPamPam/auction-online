package org.vagrs.auction.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vagrs.auction.model.db.User;

/**
 * Created by Kirill Zhitelev on 10.02.2018.
 */
@Repository
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    @Override
    public User loadByUsername(String username) {
        return sessionFactory.getCurrentSession().get(User.class, username);
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
