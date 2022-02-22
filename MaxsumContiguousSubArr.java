package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;
public class MaxsumContiguousSubArr {
	
	//this is simply brute force approach
	//and time complexity is O(n^3)
	public static int MaxSubArrSumBF(int arr[],int n) {
		
		int maxsum=0;
		int sum=0;
		for(int s=0;s<n;s++) {
			for(int e=s;e<n;e++) {
				sum=0;
				for(int k=s;k<=e;k++) {
					sum+=arr[k];
				}
				maxsum=Math.max(maxsum,sum);
			}
		}
		return maxsum;
	}
	
	//this is simply using Prefix Sum array
	//and time complexity is O(n^2)
	public static int MaxSubArrSumUPrefixSum(int arr[],int n) {
		
		int maxsum=0;
		int sum=0;
		int prefixsum[]=new int[n];
		prefixsum[0]=arr[0];
		for(int i=1;i<n;i++) {
			prefixsum[i]=prefixsum[i-1]+arr[i];
		}
		for(int s=0;s<n;s++) {
			
			for(int e=s;e<n;e++) {
				sum=prefixsum[e]-prefixsum[s]+arr[s];
			}
			maxsum=Math.max(maxsum,sum);
			
		}
		return maxsum;
	}
	
	
	public static int kadensAlgo(int arr[],int n) {
		int maxtemp=0;
		int maxsum=0;
		//iterate over the array
		for(int i=0;i<n;i++) {
			//Updating max sum till current index
			maxtemp+=arr[i];
			//storing max sum so far by choosing maximum between maxsum
			//so far and max till current index
			if(maxsum<maxtemp) 
				maxsum=maxtemp;
			//if max sum at current index is negative we do not need 
			//it to result so we update it to zero
			if(maxtemp<0)
				maxtemp=0;
		}
		return maxsum;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(MaxsumContiguousSubArr.MaxSubArrSumBF(arr,n));
		System.out.println(MaxsumContiguousSubArr.MaxSubArrSumUPrefixSum(arr,n));
		System.out.println(MaxsumContiguousSubArr.kadensAlgo(arr,n));
	}

}
