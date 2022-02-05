package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class MSBOfaGivenNum {
	
	public static int msbOfaGivenNumber(int n) {
		
		int k=(int)Math.floor((Math.log10(n))/Math.log10(2));
		//at first find the value of log2(n) this gives you the set bit at msb
		//then find the value of 2^floor(log2(n))
		//this gives you the value of msb set for a given number
		//iterativePower is a method to find value of a number 2 with a power raises to k.
		int res=(int)IterativePower.iterativePower(2, k);
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(MSBOfaGivenNum.msbOfaGivenNumber(n));

	}

}
