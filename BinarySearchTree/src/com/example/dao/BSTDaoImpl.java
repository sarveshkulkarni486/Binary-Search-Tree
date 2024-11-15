package com.example.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.beans.Student;

public class BSTDaoImpl implements BSTDao {
	class Node{
		Student data;
		Node left;
		Node right;
		public Node(Student data) {
			this.left = null;
			this.right = null;
			this.data = data;
		}
		
	}
	Node root;
	public BSTDaoImpl() {
		this.root = null;
	}	
	@Override
	public int InsertData(Student std) {
		root = InsertNode(root, std);
		if(root!=null) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	private Node InsertNode(Node root, Student std) {
		Node newnode = new Node(std);
		if(root==null) {
			root = newnode;
			return root;
			
		}
		if(std.getSid()<root.data.getSid()) {
			root.left = InsertNode(root.left, std);
		}
		else {
			root.right = InsertNode(root.right, std);
		}
		return root;
	}
	@Override
	public Student SearchData(int id) {
		return SearchStudent(root, id);
	}
	private Student SearchStudent(Node root, int id) {
		if(root==null) {
			return null;
		}
		if(root.data!=null && root.data.getSid()==id) {
			return root.data;
		}
		if(root.data!=null && root.data.getSid()>id) {
			return SearchStudent(root.left, id);
		}
		return SearchStudent(root.right, id);
	}
	@Override
	public List<Student> InorderData() {
		return InorderTraversal(root);
	}
	private List<Student> InorderTraversal(Node root) {
		List<Student> stdList = new ArrayList<Student>();
		if(root!=null) {
			stdList.addAll(InorderTraversal(root.left));
			stdList.add(root.data);
			stdList.addAll(InorderTraversal(root.right));
		}
		return stdList;
	}
	@Override
	public List<Student> PreOrder() {
		return PreOrderTraversal(root);
	}
	private List<Student> PreOrderTraversal(Node root2) {
		List<Student> stdlist = new ArrayList<Student>();
		if(root!=null) {
			stdlist.add(root.data);
			stdlist.addAll(PreOrderTraversal(root.left));
			stdlist.addAll(PreOrderTraversal(root.right));
		}
		return null;
	}
	@Override
	public List<Student> PostOrder() {
		return PostOrderTraversal(root);
	}
	private List<Student> PostOrderTraversal(Node root) {
		List<Student> lst = new ArrayList<Student>();
		if(root!=null) {
			lst.addAll(PostOrderTraversal(root.left));
			lst.addAll(PostOrderTraversal(root.right));
			lst.add(root.data);
		}
		return null;
	}
	

}
