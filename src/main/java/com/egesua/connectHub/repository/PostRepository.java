package com.egesua.connectHub.repository;

import com.egesua.connectHub.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
