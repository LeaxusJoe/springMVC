package com.leaxus.spring.controller;

import com.leaxus.spring.model.Member;
import com.leaxus.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by leaxus on 2016/9/30.
 */

@Controller
@RequestMapping("/msg")
public class MessageCtrl {
    @Autowired
    MemberService memberService;
    @RequestMapping("/findAll")
    public ModelAndView findAllMsg(){

        List<Member> members =memberService.findAll();
        Member member = new Member();
        if(members!=null&&members.size()>0){
            member = members.get(0);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("message");
        modelAndView.addObject("member",member);
        return modelAndView;
    }
}
