package com.rpg.microsaga.entity;


import javax.persistence.*;

@Entity
@Table(name = "Specialization")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_specialization")
    private Long id;

    @Column(name="specialization_name")
    private String linageName;

    @Column(name="fk_linage")
    private Linage linage;
}
