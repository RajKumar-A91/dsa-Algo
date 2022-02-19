package com.dsa;
import java.util.*;
import java.lang.*;
import java.io.*;

public class BitDiff {
    public static int bitDiff(int a,int b) {
    	
    	int xor=(a^b);
    	int c=0;
    	while(xor>0) {
    		xor=(xor&(xor-1));
    		c++;
    	}
    	return c;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		System.out.println(BitDiff.bitDiff(a, b));
		
		

	}

}
