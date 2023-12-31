package com.rpg.microsaga.entity;

import javax.persistence.*;

@Entity
@Table(name = "linage")
public class Linage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_linage")
    private Long id;

    @Column(name="linage_name")
    private String linageName;

    @Column(name="fk_specialization")
    private Specialization specialization;

}
