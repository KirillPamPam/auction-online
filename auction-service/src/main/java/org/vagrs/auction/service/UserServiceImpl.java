package org.vagrs.auction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vagrs.auction.dao.UserDao;
import org.vagrs.auction.model.db.User;

import java.util.ArrayList;

/**
 * Created by Kirill Zhitelev on 10.02.2018.
 */
@Service
public class UserServiceImpl implements UserDetailsService {
    private UserDao userDao;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userDao.loadByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails
                .User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
