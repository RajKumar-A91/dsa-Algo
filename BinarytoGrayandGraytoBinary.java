package com.dsa;
import java.util.*;
import java.io.*;
import java.lang.*;

public class BinarytoGrayandGraytoBinary {
	
	public static int binaryToGray(int n) {
		return (n^(n>>1));
		//this simply returns the binary equivalent of decimal number to gray code
	}
	public static int grayToBinary(int n) {
		int res=n;
		while(n>0) {
			n=n>>1;
			res^=n;
		}
		//this returns the graycode equivalen of decimal number to binary code
		return res;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(BinarytoGrayandGraytoBinary.binaryToGray(n));
        System.out.println(BinarytoGrayandGraytoBinary.grayToBinary(n));
        
	}

}
