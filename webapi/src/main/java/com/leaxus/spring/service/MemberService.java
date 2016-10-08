package com.leaxus.spring.service;

import com.leaxus.spring.model.Member;

import java.util.List;

/**
 * Created by leaxus on 2016/9/28.
 */
public interface MemberService {
    Member findByNickName(String nickname);

    List<Member> findAll();


}
