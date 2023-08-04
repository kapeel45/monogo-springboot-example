package com.example.mongodemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/user")
public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDAL userDAL;

    @GetMapping
    public List<User> getAllUsers() {
        LOG.info("Getting all users.");
        return userDAL.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable String id) {
        LOG.info("Getting user with ID: {}.", id);
        return userDAL.getUserById(id);
    }

    @PostMapping("/create")
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Saving user.");
        return userDAL.addNewUser(user);
    }
}