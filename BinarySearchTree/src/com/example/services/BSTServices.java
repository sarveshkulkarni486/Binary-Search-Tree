package com.example.services;

import java.util.List;

import com.example.beans.Student;

public interface BSTServices {

	int addData();

	Student SearchData();

	List<Student> Inorder();

	List<Student> PreOrder();

	List<Student> PostOrder();


}
