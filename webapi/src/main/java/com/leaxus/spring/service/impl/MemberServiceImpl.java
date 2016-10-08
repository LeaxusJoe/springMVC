package com.leaxus.spring.service.impl;

import com.leaxus.spring.dao.member.MemberDao;
import com.leaxus.spring.model.Member;
import com.leaxus.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by leaxus on 2016/9/28.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Member findByNickName(String nickname) {
        Member member = memberDao.findByNickName(nickname);
        return member;
    }

    @Override
    public List<Member> findAll() {
        List<Member> memberList = memberDao.findAll();
        return memberList;
    }
}
