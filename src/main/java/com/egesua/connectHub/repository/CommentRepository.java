package com.egesua.connectHub.repository;

import com.egesua.connectHub.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
