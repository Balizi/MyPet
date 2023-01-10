package com.example.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "publication")
@Data
public class PublicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private int nbJ;

    private float price;

    @OneToOne
    private UserEntity userEntity;

    @OneToOne
    private AnimalEntity animalEntity;

    @OneToMany(mappedBy = "publicationEntity")
    private List<CommentEntity> commentEntities;

}
