package com.example.jpa.jpaonetomanydemo.repository;

import com.example.jpa.jpaonetomanydemo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
