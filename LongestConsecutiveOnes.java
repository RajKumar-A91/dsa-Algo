package com.dsa;
import java.lang.*;
import java.io.*;
import java.util.*;
public class LongestConsecutiveOnes {
	
	public static int longestConsecutiveOnes(int n) {
		int max_consecutives=0;
		int count=0;
		while(n>0) {
			if((n&1)==0)//checks right most bit in n is 0 or not ie is like checking for even
				{
				
				count=0;
				if(max_consecutives<count)
					max_consecutives=count;
			}
			if((n&1)==1)//checks right most bit in n is 1 or not ie is like checking for odd 
				{
				count++;
				if(max_consecutives<count)
					max_consecutives=count;
			}
			n>>=1;
				//this right shifts n by 1 ie is divided by 2
		}
		return max_consecutives;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(LongestConsecutiveOnes.longestConsecutiveOnes(n));
	}

}
