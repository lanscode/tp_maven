package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;




public class CountDuplicateChars {
	public static final Logger LOGGER = Logger.getLogger(CountDuplicateChars.class.getName());
	public char noneRepeatableChar(String s) {
		char c=' ';
		s = s.toLowerCase();
		 for(int i=0;i<s.length();i++) {
			 for(int j=i+1;j<s.length();j++) {
				 c=s.charAt(i);
				 if(s.charAt(i)==s.charAt(j)) {
					 c=' ';
					 break;
				 }		 
			 }
			 if(c!=' ')
				 return c;
			 
		 }
		return c;
	}
	public List<Character> countDuplcateChars(String s) {
		char[] chars=(s.toUpperCase()).toCharArray();
		int[] nbr = {1, 2, 3,6,7};
		int  sum = Arrays.stream(nbr)
				.sorted()
				.filter(x->x%2==0)
				.reduce(0,(a,b)->a+b);	
		int max = Arrays.stream(nbr).max().getAsInt();
		
		LOGGER.info("Sum is "+sum+" "+max);
				
		List<Character> res = new ArrayList<>();
		Map<Character, Integer> counts = new HashMap<>();
		
		for(int i=0;i<chars.length;i++) {
			counts.compute(chars[i],(k,v)->(v==null)?1:++v);
		}
		
		for(Entry<Character, Integer>  j:counts.entrySet()) {
			LOGGER.info("j "+j.getKey()+j.getValue());
			if(j.getValue()>Integer.valueOf(1)) 
				res.add(j.getKey());
			}
		return res;
	}
	public static void main(String[]args) {
		CountDuplicateChars cDC = new CountDuplicateChars();
		String name="Lancine KEITAL";
		LOGGER.log(Level.INFO," "+cDC.noneRepeatableChar(" noneRepeatableChar "+name));
		for(Character c:cDC.countDuplcateChars(name)) {
			LOGGER.log(Level.INFO,c+" OK GIT PULL TEST ");
		}
		
	}

}
