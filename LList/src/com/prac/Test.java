package com.prac;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,String> map2 = new HashMap<String,String>();
		map1.put("a", null);
		String map1value = map1.get("a");
		map2.put("b", map1value);
		System.out.println("map2>>>> "+ map2);
	}

}
