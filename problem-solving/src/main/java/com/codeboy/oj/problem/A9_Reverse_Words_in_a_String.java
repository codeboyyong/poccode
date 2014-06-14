package com.codeboy.oj.problem;

public class A9_Reverse_Words_in_a_String {
	public String reverseWords(String s) {
		if(s ==null){
			return "";
		}else if(s.trim().length()==0){
			return "";
		}else{
		    s=s.trim();
		}
		String result="";
		//String .split is not a good way
		if(s.indexOf(" ")>0){
			while(s.indexOf(" ")>0) {
				result = s.substring(0,s.indexOf(" ") ) +" "+ result;
				s = s.substring(s.indexOf(" ")+1).trim();
			}
		 	return  (s +" " +result).trim();
		}else{
			return s;
		}
	}
}
