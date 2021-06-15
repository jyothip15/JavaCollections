package com.Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		//int a[]=new int a[5];//size is fixed.

		LinkedList<Integer> ll=new LinkedList<>();//no size limit

		ll.add(220);		
		ll.add(32);
		ll.add(23);		
		ll.add(52);	
		ll.add(32);	
	    ll.add(3,33);//we are inserting a new element in 3rd index position.Its appending
		ll.add(322);


		/*		//1st way
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println("item inthe list = "+it.next());
		}
		 */	
		for(int i=0;i<ll.size();i++)
//		for(int i=ll.size()-1;i>0;i--)
					
		{
			System.out.println("item inthe list(before sorting) = "+ll.get(i));
		}


		System.out.println("*********************");
		Collections.sort(ll);

		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println("item inthe list = "+it.next());
		}

	}

}
