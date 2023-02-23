package com.array;

public class ArrayDeclByNew {
  public static void main(String[] args) {
	int ar[] = new int[4];  // Array Declaration
	ar[0] = 10;
	ar[1] =20;
	ar[2] =30;
	ar[3] =40;
	
	for(int i =0; i<=ar.length-1; i++) {
		System.out.println(ar[i]);
	}
	
	
}
}
