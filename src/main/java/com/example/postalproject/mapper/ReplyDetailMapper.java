package com.example.postalproject.mapper;

import com.example.postalproject.pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailMapper {
    List<ReplyDetail> selectByinvid(Long id);

    int deleteByPrimaryKey(Long id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    ReplyDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);
}