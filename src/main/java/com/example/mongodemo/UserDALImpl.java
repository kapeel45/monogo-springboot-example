package com.example.mongodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDALImpl implements UserDAL {

    @Autowired
    MongoOperations mongoOperations;

    @Override
    public List<User> getAllUsers() {
        return mongoOperations.findAll(User.class);
    }

    @Override
    public User getUserById(String userId) {
        return mongoOperations.findOne(Query.query(Criteria.where("_id").is(userId)),User.class);
    }

    @Override
    public User addNewUser(User user) {
        mongoOperations.save(user);
        return user;
    }

    @Override
    public Object getAllUserSettings(String userId) {
        return null;
    }

    @Override
    public String getUserSetting(String userId, String key) {
        return null;
    }

    @Override
    public String addUserSetting(String userId, String key, String value) {
        return null;
    }
}
