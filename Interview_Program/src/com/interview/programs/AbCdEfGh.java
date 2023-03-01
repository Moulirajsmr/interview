package com.interview.programs;

public class AbCdEfGh {
	
	public static void main(String[] args) {
		String s = "abcdefghijkl";
		
		int length = s.length();
		int index = length-1;
		
		for (int i = 0; i <= index; i++) {
			if (i%2==0) {
				String upperCase =s.toUpperCase();
				System.out.print(upperCase.charAt(i));
				
			} else {
				String lowerCase = s.toLowerCase();
				System.out.print(lowerCase.charAt(i));

			}
			
		}
	}
	
	
	
	
	
	
	
	
	

}
