package com.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set1 {

	public static void main(String[] args) {
		//HashSet  example
/*		HashSet<Integer> hs= new HashSet<>();
		hs.add(2);
		hs.add(34);
		hs.add(42);
		hs.add(11);

		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
*/
		
		//Linked HashSet example	
		LinkedHashSet<Integer> hs= new LinkedHashSet<>();
		hs.add(2);
		hs.add(null);
		hs.add(34);
		hs.add(42);
		hs.add(11);

		Iterator<Integer> it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
