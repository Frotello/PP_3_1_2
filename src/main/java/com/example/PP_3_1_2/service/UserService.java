package com.example.PP_3_1_2.service;


import com.example.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long id);

    void createUser(User user);

    void updateUser(User user);

    User deleteUser(Long parseUnsignedInt);
}
