package com.egesua.connectHub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "p_like")
public class Like {
    @Id
    private Long id;
    private Long postId;
    private Long userId;
}
