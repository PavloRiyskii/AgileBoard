package com.practice.agileboard.service.impl;

import com.practice.agileboard.dto.UserDTO;
import com.practice.agileboard.model.User;
import com.practice.agileboard.model.UserBoard;
import com.practice.agileboard.repository.UserBoardRepository;
import com.practice.agileboard.repository.UserRepository;
import com.practice.agileboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Павло on 08.12.2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserBoardRepository boardRepository;

    public void saveUser(UserDTO dto) {
        User newUser = new User(dto.getEmail(), dto.getPassword().hashCode());

        newUser = this.userRepository.save(newUser);
        this.boardRepository.save(new UserBoard("To Do", newUser));
        this.boardRepository.save(new UserBoard("In progress", newUser));
        this.boardRepository.save(new UserBoard("Done", newUser));
    }

    public User findByEmail(String email) {
        return this.userRepository.findUserByEmail(email);
    }
}
