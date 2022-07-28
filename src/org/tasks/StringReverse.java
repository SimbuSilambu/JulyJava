package org.tasks;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s = "career guidance";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		//Split and reverse
		String[] ss = s.split(" ");
		for(int i=0;i<ss.length;i++) {
			String z = ss[i]+" ";
			for(int j=z.length()-1;j>=0;j--) {
				System.out.print(z.charAt(j));
				}}
		}}
