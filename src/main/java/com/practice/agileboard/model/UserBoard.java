package com.practice.agileboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Павло on 08.12.2017.
 */
@Document(collection = "user_boards")
public class UserBoard {

    @Id
    private String id;

    private String name;
    @DBRef()
    private User user;

    public UserBoard() {
    }

    public UserBoard(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
