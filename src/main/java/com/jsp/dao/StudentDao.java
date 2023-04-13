package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Student1;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bhushan");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	//save
	public Student1 saveStudent(Student1 student1){
	
		
		if(student1 != null){
			entityTransaction.begin();
			entityManager.persist(student1);
			entityTransaction.commit();
			return student1;
		}else {
			return null;
		}
	}
	//getby Id
	public Student1 getStudentById(int id){
		return entityManager.find(Student1.class, id);
	}

}
