package com.practice.agileboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Павло on 09.12.2017.
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"/", "/index", "/home"})
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    
}
