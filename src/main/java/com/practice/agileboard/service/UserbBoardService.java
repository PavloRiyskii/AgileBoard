package com.practice.agileboard.service;

import com.practice.agileboard.dto.CreateUserBoardDTO;
import com.practice.agileboard.dto.UserBoardDTO;

import java.util.List;

/**
 * Created by Павло on 08.12.2017.
 */
public interface UserbBoardService {
    List<UserBoardDTO> getUserBoards(String userId);
    UserBoardDTO getById(String boardId);
    void create(String userId, CreateUserBoardDTO dto);
    void update(String boardId, CreateUserBoardDTO dto);
    void delete(String boardId);
}
