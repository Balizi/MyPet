package com.example.api.services.impl;

import com.example.api.dtos.PostApplyDto;
import com.example.api.model.PostApplyEntity;
import com.example.api.repository.PostApplyRepository;
import com.example.api.services.PostApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostApplyServiceImpl implements PostApplyService {

    private final PostApplyRepository postApplyRepository;

    @Autowired
    public PostApplyServiceImpl(PostApplyRepository postApplyRepository) {
        this.postApplyRepository = postApplyRepository;
    }

    @Override
    public PostApplyDto applyPost(PostApplyDto postApplyDtoRequest) {
        PostApplyEntity postApplyEntity = new PostApplyEntity();
        BeanUtils.copyProperties(postApplyDtoRequest,postApplyEntity);
        PostApplyEntity postApplyEntityResult = postApplyRepository.save(postApplyEntity);
        PostApplyDto postApplyDtoResponse = new PostApplyDto();
        BeanUtils.copyProperties(postApplyEntityResult,postApplyDtoResponse);
        return postApplyDtoResponse;
    }
}
