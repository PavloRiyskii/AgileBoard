package com.practice.agileboard.dto;

/**
 * Created by Павло on 08.12.2017.
 */
public class CreateBoardElementDTO {
    private String name;
    private String description;
    private String boardId;

    public CreateBoardElementDTO() {
    }

    public CreateBoardElementDTO(String name, String description, String boardId) {
        this.name = name;
        this.description = description;
        this.boardId = boardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
}
