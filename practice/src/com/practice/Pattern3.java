package com.practice;

import java.util.Iterator;

public class Pattern3 {
	public static void main(String[] args) {
		int n =5;
		//System.out.println("---------pattern1--------");
		//pattern1(n);
		//System.out.println("---------pattern2--------");
		//pattern2(n);
		//System.out.println("---------pattern3--------");
		// pattern3(n);
		//System.out.println("--------pattern4---------");
		//pattern4(n);
		//System.out.println("-------pattern5----------");
		//pattern5(n);
		//System.out.println("-------pattern6----------");
		//pattern6(n);
		//System.out.println("-------pattern7----------");
		//pattern7(n);
		//System.out.println("-------pattern8----------");
		//pattern8(n);
		//System.out.println("-------pattern9----------");
		//pattern9(n);
		System.out.println("-------pattern10----------");
		pattern10(n);
	}
	
	public static void pattern1(int n) {
		for(int i=0; i<=n;i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n) {
		for(int i=0; i<=n; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++) {
			for(int k=4; k>=i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n) {
		for(int i=0; i<=n; i++) {
			for(int j = n; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			
			for (int k = n; k >=i; k--) {
				System.out.print("* ");
			}
			 
			System.out.println();
		}
	}
	
	
	public static void pattern6(int n) {
		for(int i =0; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print("  ");
			}
			for(int k =0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			for(int k=4; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print( j );
			}
			System.out.println();
		}
	}
	public static void pattern8(int n) {
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern9(int n) {
		for(int i =1; i<=n; i++) {
			for(int j = n; j>=i; j--) {
				System.out.print(n-j+1+" ");
			}
			System.out.println();
		}
	}
	public static void pattern10(int n) {
		int start =1;
		for(int i =0; i<n; i++) {
			if(start%2==0) {
				 start=1;
			}else {
				 start=0;
			}
			for(int j =0; j<=i; j++) {
				System.out.print(start+" ");
				start= 1-start;
			}
			System.out.println();
		}
	}
}
