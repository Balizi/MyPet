package com.example.api.dtos;

import com.example.api.model.PublicationEntity;
import com.example.api.model.UserEntity;
import lombok.Data;

@Data
public class PostApplyDto {

    private PublicationEntity publicationEntity;

    private UserEntity userEntity;

}
