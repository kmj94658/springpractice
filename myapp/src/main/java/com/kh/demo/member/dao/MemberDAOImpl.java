package com.kh.demo.member.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int joinMember(String id, String pwd, String nickname) {
		log.info("int joinMember(String id, String pwd, String nickname) 호출됨");
		log.info("id:${id}");
		log.info("pwd:${pwd}");
		log.info("nickname:${nickname}");
		
		//sql문 생성
		StringBuilder sql = new StringBuilder();
		sql.append("insert into member values(?,?,?)");
		
		//sql문 실행
		int result = jt.update(sql.toString(), id,pwd,nickname);
		
		return result;
	}
	
}
