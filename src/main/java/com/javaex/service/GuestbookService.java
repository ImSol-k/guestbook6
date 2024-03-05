package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	GuestbookDao guestbookDao;

	//리스트
	public List<GuestbookVo> exeList() {
		System.out.println("GuestbookService.exeList()");
		
		List<GuestbookVo> guestbookList = guestbookDao.guestbookSelect();
		
		return guestbookList;
	}
	
	//추가
	public int exeAdd(GuestbookVo buestbookVo) {
		return guestbookDao.guestbookInsert(buestbookVo);
	}
	
	//삭제
	public int exeDelete(GuestbookVo buestbookVo) {
		return guestbookDao.guestbookDelete(buestbookVo);
	}
}
