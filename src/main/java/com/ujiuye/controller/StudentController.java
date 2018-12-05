package com.ujiuye.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ujiuye.bean.Pie;
import com.ujiuye.bean.Student;
import com.ujiuye.service.StudentService;

@Controller
public class StudentController {
	@Resource
	private StudentService service;

	@RequestMapping("getAll")
	public @ResponseBody List<Student> getAll() {
		return service.getAllStu();
	}

	@RequestMapping("getPie")
	public @ResponseBody List<Pie> getPie() {
		List<Pie> pies = new ArrayList<Pie>();
		List<Student> stus = service.getAllStu();
		for (Student stu : stus) {
			Pie pie = new Pie();
			pie.setName(stu.getName());
			pie.setValue(stu.getScore());
			pies.add(pie);
		}
		return pies;
	}
}
