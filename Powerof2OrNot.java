package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Powerof2OrNot {
	
	public static boolean powerOf2OrNot(int n) {
		
		if((n&(n-1))==0) {
			return true;
		}
		else return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		in.close();
		System.out.println(Powerof2OrNot.powerOf2OrNot(n));

	}

}
