package com.gaurav.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gaurav.model.Student;
import com.gaurav.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	@RequestMapping("/index")
	public String setupForm(Map<String, Object>  map) {
		System.out.println("hi1");
		Student student=new Student();
		map.put("student", student);
		map.put("studentList", studentService.getallStudent());
		return "student";
	}
	@RequestMapping(value="/student",method=RequestMethod.POST)
	public String doActions(@ModelAttribute Student student ,BindingResult result ,@RequestParam String action,Map<String, Object>  map ) {
		
		System.out.println("hi2");

		Student studentResult  = new Student();
	
	switch(action.toLowerCase()){
	case "add":
	studentService.add(student);
	studentResult=student;
	break;
	case "edit":
		studentService.edit(student);
		studentResult=student;
		break;
	case "delete":
		studentService.delete(student.getStudentId());
		studentResult=student;
		break;
	case "search":
		Student seachedStudent = studentService.getStudent(student.getStudentId());
		studentResult=seachedStudent!=null ? seachedStudent : new Student();
		break;
	}
	map.put("student", studentResult);
	map.put("studentList", studentService.getallStudent());
	
	return "student";
}
}
  