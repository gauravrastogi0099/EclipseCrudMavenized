package com.gaurav.doa.impl;

import java.util.List;

 import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaurav.doa.StudentDao;
import com.gaurav.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
 @Autowired
	private SessionFactory session;
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Student student) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(student);
	}

	

	@Override
	public Student getStudent(int studentid) {
		// TODO Auto-generated method stub
		return (Student)session.getCurrentSession().get(Student.class,studentid);
	}

	@Override
	public List getallStudent() {
		// TODO Auto-generated method stub
		
		return session.getCurrentSession().createCriteria(Student.class).list();
	}

	@Override
	public void delete(int studentid) {
		// TODO Auto-generated method stub
		try {
		session.getCurrentSession().delete(getStudent(studentid));
	}catch(Exception e) {
		System.out.println("exception occcc"+e);
	}
		}

}
