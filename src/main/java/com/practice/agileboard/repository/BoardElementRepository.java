package com.practice.agileboard.repository;


import com.practice.agileboard.model.BoardElement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardElementRepository extends MongoRepository<BoardElement, String> {
    List<BoardElement> findBoardElementsByBoardIdOrderByPosition(String id);
    void deleteAllByBoardId(String id);
    BoardElement findBoardElementByBoardIdOrderByPositionDesc(String boardId);
}