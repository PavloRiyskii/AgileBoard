package com.practice.agileboard.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Павло on 08.12.2017.
 */
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String email;
    private Integer passHash;

    public User() {
    }

    public User(String email, Integer passHash) {
        this.email = email;
        this.passHash = passHash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPassHash() {
        return passHash;
    }

    public void setPassHash(Integer passHash) {
        this.passHash = passHash;
    }
}
