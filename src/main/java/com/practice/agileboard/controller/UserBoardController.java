package com.practice.agileboard.controller;

import com.practice.agileboard.dto.CreateUserBoardDTO;
import com.practice.agileboard.dto.UserBoardDTO;
import com.practice.agileboard.service.UserService;
import com.practice.agileboard.service.UserbBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Павло on 08.12.2017.
 */
@Controller
@RequestMapping(value = "/boards")
public class UserBoardController {

    //TODO - check is board that is going to be deleted belongs to user
    //TODO - check is board that is going to be updated belongs to user

    @Autowired
    private UserbBoardService userbBoardService;

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public String saveNewBoard(Model model, CreateUserBoardDTO dto) {
        this.userbBoardService.create(getAuthenticatedUserId(), dto);
        return "redirect:/boards";
    }

    @RequestMapping(value = "/save")
    public String savePage() {
        return "save_board";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String allBoards(Model model) {
        model.addAttribute("boards", userbBoardService.getUserBoards(getAuthenticatedUserId()));
        return "boards";
    }


    @RequestMapping(value = "/{boardId}", method = RequestMethod.DELETE)
    public String deleteBoard(@PathVariable("boardId") String boardId) {
        this.userbBoardService.delete(boardId);
        return "redirect:/boards";
    }

    @RequestMapping(value = "/{boardId}")
    public String updatePage(@PathVariable("boardId") String boardId, Model model) {
        UserBoardDTO boardDTO = this.userbBoardService.getById(boardId);
        model.addAttribute("board", boardDTO);
        return "update_board";
    }

    @RequestMapping(value = "/{boardId}", method = RequestMethod.PATCH)
    public String update(@PathVariable("boardId") String boardId, CreateUserBoardDTO dto){
        this.userbBoardService.update(boardId, dto);
        return "redirect:/boards";
    }

    private String getAuthenticatedUserId() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return this.userService.findByEmail(email).getId();
    }

}
