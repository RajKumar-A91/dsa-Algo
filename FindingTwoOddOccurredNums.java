package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.Math.*;
public class FindingTwoOddOccurredNums {
	
	public static void findingTwoOddOccurredNumsNaive(int []arr,int n) {
	  for(int i=0;i<n;i++) {
		  int count=0;
		  for(int j=0;j<n;j++) {
			  if(arr[i]==arr[j]) count++;
		  }
		  if((count&1)==1) System.out.print(arr[i]+" ");
	  }
	}
	public static void findingTwoOddOccurredNumbers(int []arr,int n) {
		
		//efficient solution with TimeComplexity O(n)
		int xor=0,res1=0,res2=0;
		for(int i=0;i<n;i++) {
			//finding the xor of all elements in an array
			xor^=arr[i];
		}
		int sn=xor&~(xor-1);//this gives the rightmost set bit in xor
		//now divide even and odd numbers 
		for(int i=0;i<n;i++) {
			if((sn&arr[i])!=0) res1^=arr[i];
			else res2^=arr[i];
		}
		System.out.println(res1+" "+res2);
		
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		FindingTwoOddOccurredNums.findingTwoOddOccurredNumbers(arr, n);
		FindingTwoOddOccurredNums.findingTwoOddOccurredNumsNaive(arr, n);
	}

}
