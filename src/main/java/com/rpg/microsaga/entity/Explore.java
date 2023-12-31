package com.rpg.microsaga.entity;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Table(name = "explore")
public class Explore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_explore")
    private Long id;

    @Column(name="map_name")
    private String mapName;

    @Column(name="duration")
    private Duration duration;

    @Column(name="reward")
    private String reward;

}