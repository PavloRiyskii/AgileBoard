package com.practice.agileboard.service;

import com.practice.agileboard.dto.BoardElementDTO;
import com.practice.agileboard.dto.CreateBoardElementDTO;

/**
 * Created by Павло on 08.12.2017.
 */
public interface BoardElementService {
    BoardElementDTO getElementByid(String elementId);
    void create(CreateBoardElementDTO dto);
    void update(String elementId, CreateBoardElementDTO dto);
    void delete(String elementId);
}
