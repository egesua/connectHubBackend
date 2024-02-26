package com.egesua.connectHub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class Post {

    @Id
    private Long id;
    private Long userId;
    private String title;

    @Column(name = "text")
    private String text;
}
