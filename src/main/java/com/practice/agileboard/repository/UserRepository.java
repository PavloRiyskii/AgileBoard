package com.practice.agileboard.repository;

import com.practice.agileboard.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Павло on 08.12.2017.
 */

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    User findUserByEmail(String email);
}
