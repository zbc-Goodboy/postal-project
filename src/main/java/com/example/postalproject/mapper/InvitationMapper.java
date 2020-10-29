package com.example.postalproject.mapper;

import com.example.postalproject.pojo.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationMapper {
    List<Invitation> selectAll();

    List<Invitation> selectLikename(@Param("name")String name);

    int deleteByPrimaryKey(Long id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}