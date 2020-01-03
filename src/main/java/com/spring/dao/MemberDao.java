package com.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.MemberDto;

@Repository
public class MemberDao extends SqlSessionDaoSupport {
	
	public void insertMember(MemberDto dto)
	{
		getSqlSession().insert("memberInsert",dto);
	}
	
	public int loginCheck(String user_name, String password)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name",user_name);
		map.put("password",password);
		
		return getSqlSession().selectOne("loginCheck",map);
	}
	
	public int emailCheck(String email)
	{
		return getSqlSession().selectOne("emailCheck",email);
	}

	
	
}
