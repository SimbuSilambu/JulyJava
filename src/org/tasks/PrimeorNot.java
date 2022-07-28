package org.tasks;

public class PrimeorNot {
	public static void main(String[] args) {
		int a[]= {2,4,8,9,10,12,14};
		int j=2;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%j==0) {
				System.out.println("prime");
				j++;
			}else System.out.println("not prime");
		}
	}

}
