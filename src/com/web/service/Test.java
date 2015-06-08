package com.web.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("1", 1);
		map.put("2",2);
		map.put("5",3);
		map.put("4",5);
		map.put("3",4);
		List list = new ArrayList();
		list.add(map);
		
		Collections.sort(list,new SortedClass());
		System.out.print(list);
	}

}

class SortedClass implements Comparator<Map> {

	@Override
	public int compare(Map o1, Map o2) {
		// TODO Auto-generated method stub
		return o1.get("1").toString().compareTo(o2.get("2").toString());
	}
	
}