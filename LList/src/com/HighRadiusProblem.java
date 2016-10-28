package com;

import java.util.*;

public class HighRadiusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenString = "(+7(*89)(*2(/94)7)3)";
		String[] stackElement = givenString.split("");
		Stack<String> s1 = new Stack<String>();
		for(int i=1;i<stackElement.length;i++) {
			//stackElement = givenString.charAt(i);
			if(!stackElement[i].isEmpty()&&stackElement[i].equals(")"))
				processSubstring(s1);
			else
				s1.push(stackElement[i]);
		}
		System.out.println(s1.pop());
		s1.clear();
	}
	public static void processSubstring(Stack<String> s1) {
		String operator ="";
		String oparand = "";
		int n = 0;
		int res = 0;
		Stack<Integer> s2 = new Stack<Integer>();
		while(!s1.isEmpty()) {
			oparand = (String) s1.pop();
			if(oparand.equals("("))
				break;
			else {
				try {
					n = Integer.parseInt(oparand);
					s2.push(n);
				}catch(NumberFormatException e) {
					operator = oparand;
				}
			}
		}
		switch(operator) {
		case "*" :
			res=(int)s2.pop();
			while(!s2.isEmpty()) {
				res= res*(int)s2.pop();
			}
			s1.push(Integer.toString(res));
			break;
		case "+" :
			res=(int)s2.pop();
			while(!s2.isEmpty()) {
				res= res+(int)s2.pop();
			}
			s1.push(Integer.toString(res));
			break;
		case "-" :
			res=(int)s2.pop();
			while(!s2.isEmpty()) {
				res= res-(int)s2.pop();
			}
			s1.push(Integer.toString(res));
			break;
		case "/" :
			res=(int)s2.pop();
			while(!s2.isEmpty()) {
				res= res/(int)s2.pop();
			}
			s1.push(Integer.toString(res));
			break;
		}
		
	}

}
