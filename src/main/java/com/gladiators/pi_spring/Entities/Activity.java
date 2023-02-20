package com.gladiators.pi_spring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Activity {


    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name = "\"description\"")
    private String description;

    @Column
    private Integer capacity;

    @Column
    private Boolean disponibility;

    @Column
    private String favourite;

    @Column
    private LocalDate startTime;

    @Column
    private LocalDate endTime;


    @OneToOne
    @JoinColumn(name = "activity_evalu_id")
    private Evaluation activityEvalu;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_user_id")
    private User activityUser;

    @OneToMany(mappedBy = "sugACti")
    private Set<Suggestion> sugACtiSuggestions;

}

