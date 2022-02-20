package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;

public class SwapOddandEvenBits {
	
	public static int swap(int n)  {
        for(int i=0;i<32;i=i+2) {
        	int sl=((n>>i)&1);
        	int sr=((n>>(i+1))&1);
        	if(sl!=0) {
        		n-=(1<<i);
        		n+=(1<<(i+1));
        	}
        	if(sr!=0) {
        		n-=(1<<(i+1));
        		n+=(1<<(i));
        	}
        }
		return n;
	}
	
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(SwapOddandEvenBits.swap(n));
		
	}

}
