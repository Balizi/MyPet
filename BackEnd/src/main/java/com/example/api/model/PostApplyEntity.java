package com.example.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "postapply")
@Data
public class PostApplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private PublicationEntity publicationEntity;

    @ManyToOne
    private UserEntity userEntity;

}
