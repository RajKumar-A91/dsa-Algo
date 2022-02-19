package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;
public class ToCheckSparse {
	
	//a number is sparse if there are no two or more consecutive one's in its
	//binary representation
	public static boolean toCheckForSparse(int n) {
		if((n&(n>>1))>=1) 
			//if BitWise And of given number and given number right shift by one is greater than or
			//equal to one then it is no sparse number
			//else it is a sparse number
			return false;
		return true;
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(ToCheckSparse.toCheckForSparse(n));
	}

}
