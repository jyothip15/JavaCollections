package com.Collections.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class Map1 {

	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();//Integer is key here,and String is value

	hm.put(1,"Akshay");//To add element we use put(similar as add() in list)
	hm.put(5,"Jnanesh");
	hm.put(7,"Laxman");
	hm.put(5,"Jnanesh CM");
	hm.put(2,"Irom");
	
	for(String s:hm.values()) {
		System.out.println(s);
	}
	
	
	
	System.out.println("********************");
	
	HashMap<Integer,String> hMap=new HashMap<>();
	
	
	
	System.out.println(hMap); //here no value as output {}
	hMap.putAll(hm);//deep copy-it will copy the value from the refered Map
	System.out.println(hMap);
	
	
	//hMap.clear();
	//System.out.println(hMap);//cleared all value
	
	System.out.println("After clear() and before clone");
	HashMap<Integer,String> hMap1=(HashMap<Integer,String>)hMap.clone();
	System.out.println(hMap1);
	
	System.out.println("/TreeMap*************************************************");
	//TreeMap

	TreeMap<Integer,String> tMap=new TreeMap<>();
	
	tMap.put(1,"Akshay");//To add element we use put(similar as add() in list)
	tMap.put(5,"Jnanesh");
	tMap.put(7,"Laxman");
	tMap.put(5,"Jnanesh CM");
	tMap.put(2,"Irom");
	
	System.out.println(tMap);
	tMap.putAll(hm);
	System.out.println(tMap);
	
	
	}

}
