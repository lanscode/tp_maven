package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class CountDuplicateChars {
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
	public ArrayList<Character> countDuplcateChars(String s) {
		char[] chars=(s.toUpperCase()).toCharArray();
		int[] nbr = {1, 2, 3,6,7};
		int  sum = Arrays.stream(nbr)
				.sorted()
				.filter(x->x%2==0)
				.reduce(0,(a,b)->a+b);	
		int max = Arrays.stream(nbr).max().getAsInt();
		
		System.out.println("Sum is "+sum+" "+max);
				
		ArrayList<Character> res = new ArrayList<Character>();
		Map<Character, Integer> counts = new HashMap<>();
		
		for(int i=0;i<chars.length;i++) {
			counts.compute(chars[i],(k,v)->(v==null)?1:++v);
		}
		
		for(Character j:counts.keySet()) {
			System.out.println("j "+j+counts.get(j));
			if(counts.get(j)>Integer.valueOf(1)) 
				res.add(j);
			}
		return res;
	}
	public static void main(String[]args) {
		CountDuplicateChars cDC = new CountDuplicateChars();
		String name="Lancine KEITAL";
		System.out.println(cDC.noneRepeatableChar(" noneRepeatableChar "+name));
		for(Character c:cDC.countDuplcateChars(name)) {
			System.out.println(c);
		}
		
	}

}
