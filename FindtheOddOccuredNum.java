package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class FindtheOddOccuredNum {
	
	public static int findtheOddOccurredNum(int []arr) {
		int res=0;
		for(int i=0;i<arr.length;i++)
			res=res^arr[i];
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(FindtheOddOccuredNum.findtheOddOccurredNum(arr));

	}

}
