package com.jsp.controller;

import com.jsp.dto.Student1;
import com.jsp.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		Student1 student1=new Student1();
		
		student1.setName("xyz");
		student1.setEmail("Xyz@mail.com");
		student1.setStatus("approved");
		
		StudentService studentService=new StudentService();
		
		Student1 student12=studentService.saveStudent(student1);
			if(student12 !=null){
				System.out.println(student12.getId() + " Sucsessfully aded");
			}
	}

}
