package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	SqlSession sqlSession;
	
	//리스트
	public List<GuestbookVo> guestbookSelect(){
		
		List<GuestbookVo> guestbookList = sqlSession.selectList("guestbook.select");
		
		return guestbookList;
	}
	
	//추가
	public int guestbookInsert(GuestbookVo guestbookVo) {
		return sqlSession.insert("guestbook.insert", guestbookVo);
	}
	
	//삭제
	public int guestbookDelete(GuestbookVo guestbookVo) {
		return sqlSession.delete("guestbook.delete", guestbookVo);
	}

}
