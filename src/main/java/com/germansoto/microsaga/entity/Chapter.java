package com.germansoto.microsaga.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "chapter")
@Getter @Setter
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CHAPTER")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "LEVEL", nullable = false)
    private int level;

    @Column(name = "LIFE", nullable = false)
    private int life;

    @Column(name = "ATTACK", nullable = false)
    private int attack;

    @Column(name = "DEFENSE", nullable = false)
    private int defense;
}
