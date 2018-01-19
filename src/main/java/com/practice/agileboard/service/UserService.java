package com.practice.agileboard.service;

import com.practice.agileboard.dto.UserDTO;
import com.practice.agileboard.model.User;

/**
 * Created by Павло on 08.12.2017.
 */
public interface UserService {
    void saveUser(UserDTO dto);
    User findByEmail(String email);
}
