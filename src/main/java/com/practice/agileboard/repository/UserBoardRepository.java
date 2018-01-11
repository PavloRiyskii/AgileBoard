package com.practice.agileboard.repository;

import com.practice.agileboard.model.UserBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Павло on 08.12.2017.
 */

@Repository
public interface UserBoardRepository extends MongoRepository<UserBoard, String> {

    List<UserBoard> findUserBoardsByUserId(String userId);
}
