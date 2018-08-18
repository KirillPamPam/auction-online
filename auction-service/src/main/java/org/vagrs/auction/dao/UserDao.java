package org.vagrs.auction.dao;

import org.vagrs.auction.model.db.User;

/**
 * Created by Kirill Zhitelev on 10.02.2018.
 */
public interface UserDao {
    User loadByUsername(String username);
}
