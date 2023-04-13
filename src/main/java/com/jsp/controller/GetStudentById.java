package com.jsp.controller;

import com.jsp.service.StudentService;

public class GetStudentById {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		studentService.getStudentById(1);
	}

}
