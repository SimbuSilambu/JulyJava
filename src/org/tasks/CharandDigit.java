package org.tasks;

public class CharandDigit {
	public static void main(String[] args) {
		
		String s="sil2244ambu66";
		
		char[] word = s.toCharArray();
		for (char w : word) {
			if(Character.isAlphabetic(w)) {
				System.out.print(w);
			}
			
		}
		for (char d : word) {
			if(Character.isDigit(d)) {
				System.out.print(d);
			}
			
		}
	}

}
