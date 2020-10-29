package com.example.postalproject.service.Impl;

import com.example.postalproject.mapper.InvitationMapper;
import com.example.postalproject.pojo.Invitation;
import com.example.postalproject.service.InvitationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class InvitationServiceImpl implements InvitationService {
    @Resource
    private InvitationMapper invitationMapper;
    @Override
    public List<Invitation> findAll() {
        return invitationMapper.selectAll();
    }

    @Override
    public List<Invitation> findLikename(String name) {
        return invitationMapper.selectLikename(name);
    }

    @Override
    public int removeByPrimaryKey(Long id) {
        return invitationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Invitation record) {
        return invitationMapper.insert(record);
    }

    @Override
    public int addSelective(Invitation record) {
        return invitationMapper.insertSelective(record);
    }

    @Override
    public Invitation findByPrimaryKey(Long id) {
        return invitationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int changeByPrimaryKeySelective(Invitation record) {
        return invitationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Invitation record) {
        return invitationMapper.updateByPrimaryKey(record);
    }
}
