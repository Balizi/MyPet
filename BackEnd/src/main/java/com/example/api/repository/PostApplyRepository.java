package com.example.api.repository;

import com.example.api.model.PostApplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostApplyRepository extends JpaRepository<PostApplyEntity, Long> {

}