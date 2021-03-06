package com.practice.agileboard.controller;

import com.practice.agileboard.dto.BoardElementDTO;
import com.practice.agileboard.dto.CreateBoardElementDTO;
import com.practice.agileboard.dto.UserBoardDTO;
import com.practice.agileboard.service.BoardElementService;
import com.practice.agileboard.service.UserService;
import com.practice.agileboard.service.UserbBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Павло on 09.12.2017.
 */
@Controller
@RequestMapping("/boards/{boardId}/elements")
public class BoardElementController {

    @Autowired
    private UserService userService;

    @Autowired
    private BoardElementService elementService;

    @Autowired
    private UserbBoardService userbBoardService;

    @RequestMapping(value = "/save")
    public String savePage(@PathVariable("boardId") String boardId, Model model) {
        model.addAttribute("boardId", boardId);
        return "save_element";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(CreateBoardElementDTO dto) {
        this.elementService.create(dto);
        return "redirect:/boards";
    }

    @RequestMapping(value = "/{elementId}")
    public String updatePage(@PathVariable("elementId") String elementId, @PathVariable("boardId") String boardId, Model model) {
        List<UserBoardDTO> boards = this.userbBoardService.getUserBoards(getAuthenticatedUserId());
        BoardElementDTO dto = this.elementService.getElementByid(elementId);
        model.addAttribute("element", dto);
        model.addAttribute("boardId", boardId);
        model.addAttribute("boards", boards);
        return "update_element";
    }

    @RequestMapping(value = "/{elementId}", method = RequestMethod.PATCH)
    public String update(@PathVariable("elementId") String id, CreateBoardElementDTO dto) {
        this.elementService.update(id, dto);
        return "redirect:/boards";
    }

    @RequestMapping(value = "/{elementId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("elementId") String elementId) {
        this.elementService.delete(elementId);
        return "redirect:/boards";
    }

    private String getAuthenticatedUserId() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return this.userService.findByEmail(email).getId();
    }
}
