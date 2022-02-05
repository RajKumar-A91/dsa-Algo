package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.Math.*;
public class FindingMissingNumArr {
	
	public static int findingMissingNumberInArray(int arr[]) {
		int res=0;
		//first find the xor of all numbers in a given array
		for(int i=0;i<arr.length;i++) {
			res^=arr[i];
		}
		//now again do the xor of obtained res with 1 to n+1 then the missing number can be obtained
		//because every number from 1 to n+1 repeated two times except missing number
		for(int i=1;i<=arr.length+1;i++) {
			res^=i;
		}
		return res;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(FindingMissingNumArr.findingMissingNumberInArray(arr));
	}

}
