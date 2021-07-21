package com.kh.demo.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.demo.member.svc.MemberSVC;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
@Data
public class MemberController {
	
	@Autowired
	private MemberSVC memberSVC;
	
	@GetMapping("/joinForm")
	public String joinMemberForm() {
		return "member/joinMember";
	}
	@GetMapping("/join")
	public String join(
			@RequestParam String id,
			@RequestParam String pwd,
			@RequestParam String nickname
			) {
		log.info("id:{}",id);
		log.info("pwd:{}",pwd);
		log.info("nickname:{}",nickname);
		return "member/joinMember";
	}
	@PostMapping("/join")
	public String join2(
			@RequestParam String id,
			@RequestParam String pwd,
			@RequestParam String nickname
			) {
		log.info("id:{}",id);
		log.info("pwd:{}",pwd);
		log.info("nickname:{}",nickname);
		
		memberSVC.joinMember(id, pwd, nickname);
		
		return "member/joinMember";
	}
}
