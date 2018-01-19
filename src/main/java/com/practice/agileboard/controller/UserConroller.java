package com.practice.agileboard.controller;

import com.practice.agileboard.dto.UserDTO;
import com.practice.agileboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Павло on 09.12.2017.
 */
@Controller
@RequestMapping(value = "/sign-up")
public class UserConroller {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String signUp(UserDTO dto) {
        this.userService.saveUser(dto);
        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String signUpPage() {
        return "sign_up";
    }

}
