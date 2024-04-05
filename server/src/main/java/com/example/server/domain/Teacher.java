package com.example.server.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "teacher", schema = "public")
public class Teacher {
    @Id
    @Column(name = "id", nullable = false, length = 6)
    private String id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id", nullable = false)
    private User user;

    @Column(name = "job_title", nullable = false, length = 10)
    private String jobTitle;

    @OneToMany(mappedBy = "teacher")
    private Set<Timeslot> timeslots = new LinkedHashSet<>();

}