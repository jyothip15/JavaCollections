package com.Collections.LinkedList;

public class Student implements Comparable<Student> {
	
	public String name;
	public int id;
	public int height;
	
	Student(String name,int id,int height)
	{
		this.name=name;
		this.id=id;
		this.height=height;
	}

//defining abstract method from interface Comparable
	public int compareTo(Student s) {
		
//		return this.id-s.id;  //sorting by id ->based on ID(Ascending order becoz this.id first)
//		return s.id-this.id;  //Descending order becoz s.id first               
//		return this.name.compareTo(s.name);    //sorting by name->based on name
		return this.height-s.height;          //based on height
	}

}
