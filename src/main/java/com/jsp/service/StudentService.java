package com.jsp.service;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student1;

public class StudentService {
	StudentDao studentDao=new StudentDao();
	
	public Student1 saveStudent(Student1 student1){
		if(student1 != null){
			student1.setStatus("unapproved");
		}
		return studentDao.saveStudent(student1);
	}
	
	public Student1 getStudentById(int id){
		if(id>0){
			return studentDao.getStudentById(id);
		}else {
			return null;
		}
	}
}
