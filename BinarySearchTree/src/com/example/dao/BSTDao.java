package com.example.dao;

import java.util.List;

import com.example.beans.Student;

public interface BSTDao {

	int InsertData(Student std);

	Student SearchData(int id);

	List<Student> InorderData();

	List<Student> PreOrder();

	List<Student> PostOrder();


}
