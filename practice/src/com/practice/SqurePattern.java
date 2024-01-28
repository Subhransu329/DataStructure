package com.practice;

public class SqurePattern {
	public static void main(String[] args) {
		int n =5;
		arrangePattern(n);
	}
	
	static void arrangePattern(int n) {
		//this loop os for rows inpattern
		for(int i =0; i<n; i++) {
			//this loop is for column patterns
			for(int j =0; j<n; j++) {
				 
				System.out.print("* ");
			}
			System.out.println();
			 
		}
	}

}
