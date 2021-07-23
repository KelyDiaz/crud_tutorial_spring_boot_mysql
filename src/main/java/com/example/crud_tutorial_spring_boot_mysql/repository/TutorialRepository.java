package com.example.crud_tutorial_spring_boot_mysql.repository;

import com.example.crud_tutorial_spring_boot_mysql.model.TutorialModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository  extends JpaRepository<TutorialModel, Long> {
    List<TutorialModel> findByPublished(boolean published);
    List<TutorialModel> findByTitleContaining(String title);
}
