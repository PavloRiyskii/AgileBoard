package com.practice.agileboard.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Павло on 08.12.2017.
 */
@Document(collection = "board_elements")
public class BoardElement {

    @Id
    private String id;

    private String name;
    private String description;
    private Integer position;

    private String boardId;

    public BoardElement() {

    }

    public BoardElement(String name, String description, Integer position, String boardId) {
        this.name = name;
        this.description = description;
        this.position = position;
        this.boardId = boardId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
}
