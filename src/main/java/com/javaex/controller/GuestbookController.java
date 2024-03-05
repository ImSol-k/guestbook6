package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.service.GuestbookService;
import com.javaex.vo.GuestbookVo;

@Controller
public class GuestbookController {

	@Autowired
	GuestbookService guestbookService;
	
	//리스트
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("GuestbookController.List()");
		
		List<GuestbookVo> guestbookList = guestbookService.exeList();
		model.addAttribute("guestlist", guestbookList);
		
		return "addList";
	}
	
	//추가
	@RequestMapping(value="/add", method= {RequestMethod.GET, RequestMethod.POST})
	public String add(GuestbookVo guestbookVo) {
		System.out.println("GuestbookController.add()");
		
		guestbookService.exeAdd(guestbookVo);
		return "redirect:/list";
	}
	
	//삭제
	@RequestMapping(value="/deleteform", method= {RequestMethod.GET, RequestMethod.POST})
	public String deleteFrom(@RequestParam("no") int bookId, Model model) {
		System.out.println("Controller.deleteForm()");
		
		model.addAttribute("no", bookId);
		return "deleteForm";
	}
	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@RequestParam("no") int bookId, @RequestParam("pw") String pw) {
		System.out.println("GuestbookController.delete()");
		
		GuestbookVo guestbookVo = new GuestbookVo(bookId, pw);
		System.out.println(bookId);
		System.out.println(pw);
		guestbookService.exeDelete(guestbookVo);
		return "redirect:/list";
	}
	
	
}
