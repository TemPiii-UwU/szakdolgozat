package com.example.server.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "\"user\"", schema = "public", indexes = {
        @Index(name = "user_email_key", columnList = "email", unique = true),
        @Index(name = "user_password_key", columnList = "password", unique = true)
})
public class User {
    @Id
    @Column(name = "id", nullable = false, length = 6)
    private String id;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "password", nullable = false, length = 128)
    private String password;

    @Column(name = "role", nullable = false, length = 20)
    private String role;

    @OneToOne(mappedBy = "user")
    private Admin admin;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments = new LinkedHashSet<>();

    @OneToOne(mappedBy = "user")
    private Teacher teacher;

}