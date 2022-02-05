package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.Math.*;
import java.lang.String.*;

public class PowerSet {
	
	public static void findingAllSubSetsOfString(String str) {
		
		int n=str.length();
		int powersize=(int)IterativePower.iterativePower(2, n);
		//total no.of subsets with n elements are 2^n-1
		for(int counter=0;counter<powersize;counter++) {
			for(int i=0;i<n;i++) {
				if((counter&(1<<i))!=0)
					System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		
		
	}
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		PowerSet.findingAllSubSetsOfString(str);
	}

}
