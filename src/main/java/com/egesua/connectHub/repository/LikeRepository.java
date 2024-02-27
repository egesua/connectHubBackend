package com.egesua.connectHub.repository;

import com.egesua.connectHub.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LikeRepository extends JpaRepository<Like, Long> {
    List<Like> findByUserIdAndPostId(Long userId, Long postId);

    List<Like> findUserById(Long userId);

    List<Like> findUserByPostId(Long postId);
}
