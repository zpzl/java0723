package com.ujiuye.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ujiuye.bean.Mobile;
import com.ujiuye.service.MobileService;

@Controller
public class MobileController {
	@Resource
	MobileService mobileService;
	@RequestMapping("search")
	public String search(String mobileNumber,Model model){
		Mobile mobile = null;
		mobile = mobileService.search(mobileNumber);
		String msg="";
		if(mobile != null){
			msg="号码"+mobileNumber+" 归属地"+mobile.getAreaCode()+" 所属运营商"+mobile.getMobileType();
		}else{
			msg="号码"+mobileNumber+"在号段库不存在";
		}
		model.addAttribute("msg", msg);
		return "result";
	}
}
