package com.gaurav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaurav.doa.StudentDao;
import com.gaurav.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
	private StudentDao StudentDao;
	
	
	@Transactional
	public void add(Student student) {
		// TODO Auto-generated method stub
		StudentDao.add(student);
	}

	@Transactional
	public void edit(Student student) {
		// TODO Auto-generated method stub
		StudentDao.edit(student);
	}

	

	@Transactional
	public Student getStudent(int studentid) {
		// TODO Auto-generated method stub
		return StudentDao.getStudent(studentid);
	}

	@Transactional
	public List getallStudent() {
		// TODO Auto-generated method stub
		return StudentDao.getallStudent()
				;
	}

	@Transactional
	public void delete(int studentid) {
		// TODO Auto-generated method stub
		StudentDao.delete(studentid);
	}

	
	
}
