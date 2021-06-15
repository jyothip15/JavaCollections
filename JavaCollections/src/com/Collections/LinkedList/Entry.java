package com.Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Entry {

	public static void main(String[] args) {
		
		LinkedList<Student> studentList=new LinkedList<>();
		studentList.add(new Student("Akshay",1,172));
		studentList.add(new Student("Iram",5,160));
		studentList.add(new Student("Abhi",3,175));
		studentList.add(new Student("Lakshman",4,180));
		studentList.add(new Student("Jnanesh",4,144));
		
		
		
		System.out.println("before sorting");
		Iterator<Student> it3=studentList.iterator();
		while(it3.hasNext())
		{
			Student tempStudent=it3.next();
			System.out.println("student id is "+tempStudent.id+" Name:"+tempStudent.name +"height ="+tempStudent.height);
			
		}
	
	Collections.sort(studentList);
	
	System.out.println("****************");
	
	System.out.println("After sorting");
	
	Iterator<Student> it4=studentList.iterator();
	while(it4.hasNext())
	{
		Student tempStudent=it4.next();
		System.out.println("student id is "+tempStudent.id+" Name:"+tempStudent.name+tempStudent.id+" Name:"+tempStudent.name +"height ="+tempStudent.height);
	
		
	}
	}

}
