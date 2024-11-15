package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.example.beans.Student;
import com.example.services.BSTServices;
import com.example.services.BSTServicesImpl;

public class TestBST {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		BSTServices bserv = new BSTServicesImpl();
		do {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert data \n2. Search Element \n3. Inorder Traversal");
			System.out.println("4. PreOrder Traversal \n5. PostOrder Traversal \n6.Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1-> {
				int res = bserv.addData();
				if(res==1) {
					System.out.println("Data inserted");
				}
				else {
					System.out.println("Data not inserted");
				}
			}
			case 2-> {
				Student stdlist = bserv.SearchData();
				if(stdlist!=null) {
					System.out.println(stdlist);
				}
				else {
					System.out.println("Id not found or tree is empty");
				}
			}
			case 3-> {
				List<Student> lst = bserv.Inorder();
				if(lst!=null) {
					System.out.println(lst);
				}
				else {
					System.out.println("Tree is empty");
				}
			}
			case 4-> {
				List<Student> lst = bserv.PreOrder();
			}
			case 5-> {
				List<Student> lst = bserv.PostOrder();
			}
			case 6-> {
				//Exit
				System.out.println("Thank you");
			}
			}
		}while(choice!=6);

	}

}
