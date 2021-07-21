package com.kh.demo.member.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.demo.member.dao.MemberDAO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberSVCImpl implements MemberSVC{

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public int joinMember(String id, String pwd, String nickname) {
		
		log.info("memberSVCImpl 호출됨");
		log.info("id:{}",id);
		log.info("pwd:{}",pwd);
		log.info("nickname:{}",nickname);
		
		return memberDAO.joinMember(id, pwd, nickname);
	}
	
}
