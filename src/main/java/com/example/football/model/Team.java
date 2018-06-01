package com.example.football.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Team {

    private Long id;
    private String name;

    public Team(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

}
