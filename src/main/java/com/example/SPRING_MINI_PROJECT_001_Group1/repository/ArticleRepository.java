package com.example.SPRING_MINI_PROJECT_001_Group1.repository;

import com.example.SPRING_MINI_PROJECT_001_Group1.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}