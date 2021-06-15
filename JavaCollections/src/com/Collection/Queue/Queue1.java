package com.Collection.Queue;


/*            
 * Pick:It will only check but wil not remove.
 *     VErifying the first element but not removing it,so it will always return same element(FIFO).
 * Poll:It Retrieving and it remove the item from queue.
 *ex:standing in line
 */
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> q=new LinkedList<String>();
		q.add("Akshay");
		q.add("Jananesh");
		q.add("nidhi");
		q.add("Abhi");
		
		for(int i=0;i<q.size();i++)
		{
//			System.out.println(q.poll());
//			System.out.println(q.size());
            System.out.println(q.peek());
            System.out.println(q.size());
            

		}
	}

}
