package com.example.crud_tutorial_spring_boot_mysql.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tutorial")
public class TutorialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public TutorialModel() {

    }

    public TutorialModel(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
