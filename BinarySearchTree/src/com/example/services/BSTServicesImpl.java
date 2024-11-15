package com.example.services;

import java.util.List;
import java.util.Scanner;

import com.example.beans.Student;
import com.example.dao.BSTDao;
import com.example.dao.BSTDaoImpl;

public class BSTServicesImpl implements BSTServices {
	Scanner sc = new Scanner(System.in);
	BSTDao bdao = new BSTDaoImpl();
	@Override
	public int addData() {
		System.out.println("Enter student id: ");
		int id = sc.nextInt();
		System.out.println("Enter student name: ");
		String name =sc.next();
		Student std = new Student(id, name);
		return bdao.InsertData(std);
	}
	@Override
	public Student SearchData() {
		System.out.println("Enter student id to search: ");
		int id = sc.nextInt();
		return bdao.SearchData(id);
	}
	@Override
	public List<Student> Inorder() {
		return bdao.InorderData();
	}
	@Override
	public List<Student> PreOrder() {
		
		return bdao.PreOrder();
	}
	@Override
	public List<Student> PostOrder() {
		return bdao.PostOrder();
	}
	

}
