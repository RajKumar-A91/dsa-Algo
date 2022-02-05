package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;

public class IterativePower {
	
	public static long iterativePower(int x,int n) {
		
		long res=1;
		while(n>0) {
			if(n%2!=0)
				res=res*x;
			x=x*x;
			n=n/2;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		sc.close();
		System.out.println(IterativePower.iterativePower(x,n));

	}

}
