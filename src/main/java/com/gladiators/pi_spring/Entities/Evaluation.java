package com.gladiators.pi_spring.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Evaluation {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String noteValue;


    @OneToOne(
            mappedBy = "activityEvalu",
            fetch = FetchType.LAZY
    )
    private Activity activityEvalu;

}
