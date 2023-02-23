package com.array;

public class ArrayOutOfBound {
// To print the array 
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		for(int i=0; i<=ar.length;i++) {   // To travers the array we used for loop
	try {	 
		System.out.println(ar[i]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
		}
	}}

