package com.egesua.connectHub.repository;

import com.egesua.connectHub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);
}
