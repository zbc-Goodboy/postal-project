package com.example.postalproject.controller;

import com.example.postalproject.pojo.Invitation;
import com.example.postalproject.pojo.ReplyDetail;
import com.example.postalproject.service.InvitationService;
import com.example.postalproject.service.ReplyDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @Resource
    private InvitationService invitationService;
    @Resource
    private ReplyDetailService replyDetailService;
    @RequestMapping("/")
    public String show(){
        return "show";
    }
    //分页
    @RequestMapping("zzx")
    @ResponseBody
    public PageInfo findAllDUser(String sdd, Integer pageNo){
        PageHelper.offsetPage((pageNo-1)*4,4);
        List<Invitation> duserList=invitationService.findAll();
        if (sdd!=null&&sdd!=""){
            duserList=invitationService.findLikename(sdd);
        }
        PageInfo<Invitation> pageInfo=new PageInfo<Invitation>(duserList);
        return pageInfo;
    }
    //添加评论
    @RequestMapping("add")
    public String add(String content, String author, HttpSession session){
        Long id = (Long) session.getAttribute("invid");
        ReplyDetail replyDetail = new ReplyDetail();
        replyDetail.setAuthor(author);
        replyDetail.setContent(content);
        replyDetail.setCreatedate(new Date());
        replyDetail.setInvid(id);
        if (replyDetailService.add(replyDetail)>0){
            session.setAttribute("message","添加回复成功");
        }
        return "show1";
    }
    //存储当前帖子id并跳转到评论页面
    @RequestMapping("watch")
    public String watch(Long id,HttpSession session){
        session.setAttribute("invid",id);
        return "show1";
    }
    //通过帖子id查看相关评论
    @RequestMapping("kjd")
    @ResponseBody
    public Object kjl(HttpSession session){
        Long id = (Long) session.getAttribute("invid");
        List<ReplyDetail> replyDetailList = replyDetailService.findByinvid(id);
        return replyDetailList;
    }
    //取添加是否成功信息
    @RequestMapping("jhg")
    @ResponseBody
    public Object jhh(HttpSession session){
        String message = (String) session.getAttribute("message");
        return message;
    }
}
