package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private Date createdAt;

    @ManyToOne
    @JsonIgnore
    private PublicationEntity publicationEntity;

    @ManyToOne
    private UserEntity userEntity;

}
