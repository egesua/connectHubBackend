package com.egesua.connectHub.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "user", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
}
