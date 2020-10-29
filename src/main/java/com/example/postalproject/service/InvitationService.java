package com.example.postalproject.service;

import com.example.postalproject.pojo.Invitation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InvitationService {
    List<Invitation> findAll();

    List<Invitation> findLikename(@Param("name")String name);

    int removeByPrimaryKey(Long id);

    int add(Invitation record);

    int addSelective(Invitation record);

    Invitation findByPrimaryKey(Long id);

    int changeByPrimaryKeySelective(Invitation record);

    int changeByPrimaryKey(Invitation record);
}
