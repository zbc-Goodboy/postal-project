package com.example.postalproject.service;

import com.example.postalproject.pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailService {
    List<ReplyDetail> findByinvid(Long id);

    int removeByPrimaryKey(Long id);

    int add(ReplyDetail record);

    int addSelective(ReplyDetail record);

    ReplyDetail findByPrimaryKey(Long id);

    int changeByPrimaryKeySelective(ReplyDetail record);

    int changeByPrimaryKey(ReplyDetail record);
}
