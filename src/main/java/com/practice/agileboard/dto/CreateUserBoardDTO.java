package com.practice.agileboard.dto;

/**
 * Created by Павло on 08.12.2017.
 */
public class CreateUserBoardDTO {
    private String name;

    public CreateUserBoardDTO() {
    }

    public CreateUserBoardDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
