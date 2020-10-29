package com.example.postalproject.service.Impl;

import com.example.postalproject.mapper.ReplyDetailMapper;
import com.example.postalproject.pojo.ReplyDetail;
import com.example.postalproject.service.ReplyDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReplyDetailServiceImpl implements ReplyDetailService {
    @Resource
    private ReplyDetailMapper replyDetailMapper;

    @Override
    public List<ReplyDetail> findByinvid(Long id) {
        return replyDetailMapper.selectByinvid(id);
    }

    @Override
    public int removeByPrimaryKey(Long id) {
        return replyDetailMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(ReplyDetail record) {
        return replyDetailMapper.insert(record);
    }

    @Override
    public int addSelective(ReplyDetail record) {
        return replyDetailMapper.insertSelective(record);
    }

    @Override
    public ReplyDetail findByPrimaryKey(Long id) {
        return replyDetailMapper.selectByPrimaryKey(id);
    }

    @Override
    public int changeByPrimaryKeySelective(ReplyDetail record) {
        return replyDetailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(ReplyDetail record) {
        return replyDetailMapper.updateByPrimaryKey(record);
    }
}
