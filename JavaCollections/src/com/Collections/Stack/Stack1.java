package com.Collections.Stack;

import java.util.Stack;

/*
 * Stack :Last In First Out(LIFO)
 * or FILO(First In Last Out)
 * Ex:keeping the plates
 */
public class Stack1 {

	public static void main(String[] args) {
	Stack<String> q=new Stack<String>();
	
	q.add("Akshay");
	q.add("Jananesh");
	q.add("nidhi");
	q.add("Abhi");
	
    int qSize=q.size();
	for(int i=0;i<qSize;i++)
	{   
		System.out.println(q.pop());//will display the list of element in LIFO order
		System.out.println(q.peek());//will head to last element everytime(not removing the element)
    }
	
	}

}
