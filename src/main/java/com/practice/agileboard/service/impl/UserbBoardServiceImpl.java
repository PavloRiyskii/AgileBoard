package com.practice.agileboard.service.impl;

import com.practice.agileboard.dto.BoardElementDTO;
import com.practice.agileboard.dto.CreateUserBoardDTO;
import com.practice.agileboard.dto.UserBoardDTO;
import com.practice.agileboard.exceptions.NotUserResourceException;
import com.practice.agileboard.model.BoardElement;
import com.practice.agileboard.model.User;
import com.practice.agileboard.model.UserBoard;
import com.practice.agileboard.repository.BoardElementRepository;
import com.practice.agileboard.repository.UserBoardRepository;
import com.practice.agileboard.repository.UserRepository;
import com.practice.agileboard.service.UserbBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Павло on 08.12.2017.
 */
@Service
public  class UserbBoardServiceImpl implements UserbBoardService {

    @Autowired
    private BoardElementRepository elementRepository;

    @Autowired
    private UserBoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public List<UserBoardDTO> getUserBoards(String userId) {
        List<UserBoard> userBoards = this.boardRepository.findUserBoardsByUserId(userId);
        List<UserBoardDTO> dtos = new LinkedList<UserBoardDTO>();
        for(UserBoard board : userBoards) {
            UserBoardDTO dto = new UserBoardDTO();
            dto.setId(board.getId());
            dto.setName(board.getName());
            List<BoardElement> elements = this.elementRepository.findBoardElementsByBoardIdOrderByPosition(board.getId());
            List<BoardElementDTO> elementDTOS = new LinkedList<BoardElementDTO>();
            for(BoardElement element : elements) {
                elementDTOS.add(new BoardElementDTO(element.getId(), element.getName(), element.getDescription()));
            }
            dto.setElements(elementDTOS);
            dtos.add(dto);
        }
        return dtos;
    }

    public UserBoardDTO getById(String boardId) {
        if(!checkIsUserResource(boardId)) {
            throw new NotUserResourceException("Board  " + boardId + " doesnt belongs to current user");
        }
        UserBoard userBoard = this.boardRepository.findOne(boardId);
        UserBoardDTO board = new UserBoardDTO();
        board.setName(userBoard.getName());
        board.setId(boardId);
        List<BoardElement> elements = this.elementRepository.findBoardElementsByBoardIdOrderByPosition(board.getId());
        List<BoardElementDTO> elementDTOS = new LinkedList<BoardElementDTO>();
        for(BoardElement element : elements) {
            elementDTOS.add(new BoardElementDTO(element.getId(), element.getName(), element.getDescription()));
        }
        board.setElements(elementDTOS);
        return board;
    }

    public void create(String userId, CreateUserBoardDTO dto) {
        UserBoard board = new UserBoard();
        board.setName(dto.getName());
        board.setUserId(userId);

        this.boardRepository.save(board);
    }

    public void update(String boardId, CreateUserBoardDTO dto) {
        if(!checkIsUserResource(boardId)) {
            throw new NotUserResourceException("Board  " + boardId + " doesnt belongs to current user");
        }
        UserBoard board = this.boardRepository.findOne(boardId);
        board.setName(dto.getName());

        this.boardRepository.save(board);
    }

    public void delete(String boardId) {
        if(!checkIsUserResource(boardId)) {
            throw new NotUserResourceException("Board  " + boardId + " doesnt belongs to current user");
        }
        this.boardRepository.delete(boardId);
        this.elementRepository.deleteAllByBoardId(boardId);
    }

    private boolean checkIsUserResource(String boardId) {
        UserBoard board = this.boardRepository.findOne(boardId);
        User bordOwner = this.userRepository.findOne(board.getUserId());
        String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
        return true ? bordOwner.getEmail() == currentUser : false;
    }
}
