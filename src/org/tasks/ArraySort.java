package org.tasks;

public class ArraySort {
	public static void main(String[] args) {
		 int a[]= {4,13,30,70,45,60};
		 int temp;
		 
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;i++) {
				 
				 if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				 }
				 
			 }}
		 
		 
	}}
