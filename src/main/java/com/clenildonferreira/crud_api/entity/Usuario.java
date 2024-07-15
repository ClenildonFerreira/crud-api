package com.clenildonferreira.crud_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "username", nullable = false, unique = true, length = 200)
    private String username;
    @Column(name = "password", nullable = false, length = 500)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 30)
    private Role role;

    public enum Role {
        ROLE_ADMIN, ROLE_CLIENT
    }
}
