package com.practice.agileboard.service.impl;

import com.practice.agileboard.dto.BoardElementDTO;
import com.practice.agileboard.dto.CreateBoardElementDTO;
import com.practice.agileboard.exceptions.NotUserResourceException;
import com.practice.agileboard.model.BoardElement;
import com.practice.agileboard.model.User;
import com.practice.agileboard.model.UserBoard;
import com.practice.agileboard.repository.BoardElementRepository;
import com.practice.agileboard.repository.UserBoardRepository;
import com.practice.agileboard.repository.UserRepository;
import com.practice.agileboard.service.BoardElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by Павло on 08.12.2017.
 */
@Service
public class BoardElementServiceImpl implements BoardElementService {

    @Autowired
    private BoardElementRepository elementRepository;

    @Autowired
    private UserBoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public BoardElementDTO getElementByid(String elementId) {
        if(!checkIsUserResource(elementId)) {
            throw new NotUserResourceException("Element " + elementId + " doesnt belongs to current user");
        }
        BoardElement element = this.elementRepository.findOne(elementId);
        return new BoardElementDTO(elementId, element.getName(), element.getDescription());
    }

    public void create(CreateBoardElementDTO dto) {
        BoardElement lastElement = this.elementRepository.findBoardElementByBoardIdOrderByPositionDesc(dto.getBoardId());
        int lastElementIndex = 0;
        if(lastElement != null) {
            lastElementIndex = lastElement.getPosition() + 1;
        }
        BoardElement element = new BoardElement(dto.getName(), dto.getDescription(),
                lastElementIndex, dto.getBoardId());
        this.elementRepository.save(element);
    }

    public void update(String elementId, CreateBoardElementDTO dto) {
        if(!checkIsUserResource(elementId)) {
            throw new NotUserResourceException("Element " + elementId + " doesnt belongs to current user");
        }
        BoardElement element = this.elementRepository.findOne(elementId);
        element.setDescription(dto.getDescription());
        element.setName(dto.getName());
        element.setBoardId(dto.getBoardId());

        this.elementRepository.save(element);
    }

    public void delete(String elementId) {
        if(!checkIsUserResource(elementId)) {
            throw new NotUserResourceException("Element " + elementId + " doesnt belongs to current user");
        }
        this.elementRepository.delete(elementId);
    }

    private boolean checkIsUserResource(String elementId) {
        BoardElement element = this.elementRepository.findOne(elementId);
        UserBoard board = this.boardRepository.findOne(element.getBoardId());
        User bordOwner = this.userRepository.findOne(board.getUserId());
        String currentUser = SecurityContextHolder.getContext().getAuthentication().getName();
        return true ? bordOwner.getEmail() == currentUser : false;
    }
}
