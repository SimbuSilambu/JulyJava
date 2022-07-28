package org.tasks;

public class Palindrome {
	public static void main(String[] args) {
		
		String s="ara";
		String ss="";
		for (int i = s.length()-1; i>=0; i--) {
			ss = ss+s.charAt(i);
			
		} if(s.equals(ss)) {
			System.out.println("palidrome");
		}else System.out.print("not");
		
	}}
