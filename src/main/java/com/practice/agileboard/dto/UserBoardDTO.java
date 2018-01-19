package com.practice.agileboard.dto;

import java.util.List;

/**
 * Created by Павло on 08.12.2017.
 */
public class UserBoardDTO {

    private String id;
    private String name;
    private List<BoardElementDTO> elements;

    public UserBoardDTO() {
    }

    public UserBoardDTO(String id, String name, List<BoardElementDTO> elements) {
        this.id = id;
        this.name = name;
        this.elements = elements;
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

    public List<BoardElementDTO> getElements() {
        return elements;
    }

    public void setElements(List<BoardElementDTO> elements) {
        this.elements = elements;
    }
}
