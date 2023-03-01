package com.example.PP_3_1_2.dao;


import com.example.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(Long id);

    void deleteUser(Long id);
}
