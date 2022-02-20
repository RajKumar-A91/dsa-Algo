package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;
public class MaxBitWiseAndValue {
	
	public static int checkBit(int pattern,int []arr,int n) {
		
		int count=0;
		for(int i=0;i<n;i++) {
			if((pattern&arr[i])==pattern) {
				count++;
			}
		}
		System.out.println("patter="+pattern);
		System.out.println("count="+count);
		return count;
		
	}
	
	public static int maxAnd(int arr[],int n) {
		
		int res=0,count;
		for(int bit=4;bit>=0;bit--) {
			count=checkBit((res|(1<<bit)),arr,n);
			if(count>=2) {
				res|=(1<<bit);
			}
			System.out.println("res="+res);
			System.out.println("+++++++++++++++++++");
		}
		return res;	
	}
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(MaxBitWiseAndValue.maxAnd(arr, n));
	}

}
